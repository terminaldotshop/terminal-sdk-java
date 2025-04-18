# Terminal Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/shop.terminal.api/terminal-java)](https://central.sonatype.com/artifact/shop.terminal.api/terminal-java/2.2.0)
[![javadoc](https://javadoc.io/badge2/shop.terminal.api/terminal-java/2.2.0/javadoc.svg)](https://javadoc.io/doc/shop.terminal.api/terminal-java/2.2.0)

<!-- x-release-please-end -->

The Terminal Java SDK provides convenient access to the [Terminal REST API](https://terminal.shop/docs) from applications written in Java.

The Terminal Java SDK is similar to the Terminal Kotlin SDK but with minor differences that make it more ergonomic for use in Java, such as `Optional` instead of nullable values, `Stream` instead of `Sequence`, and `CompletableFuture` instead of suspend functions.

It is generated with [Stainless](https://www.stainless.com/).

<!-- x-release-please-start-version -->

The REST API documentation can be found on [terminal.shop](https://terminal.shop/docs). Javadocs are available on [javadoc.io](https://javadoc.io/doc/shop.terminal.api/terminal-java/2.2.0).

<!-- x-release-please-end -->

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("shop.terminal.api:terminal-java:2.2.0")
```

### Maven

```xml
<dependency>
  <groupId>shop.terminal.api</groupId>
  <artifactId>terminal-java</artifactId>
  <version>2.2.0</version>
</dependency>
```

<!-- x-release-please-end -->

## Requirements

This library requires Java 8 or later.

## Usage

```java
import shop.terminal.api.client.TerminalClient;
import shop.terminal.api.client.okhttp.TerminalOkHttpClient;
import shop.terminal.api.models.product.ProductListParams;
import shop.terminal.api.models.product.ProductListResponse;

// Configures using the `TERMINAL_BEARER_TOKEN` and `TERMINAL_BASE_URL` environment variables
TerminalClient client = TerminalOkHttpClient.fromEnv();

ProductListResponse products = client.product().list();
```

## Client configuration

Configure the client using environment variables:

```java
import shop.terminal.api.client.TerminalClient;
import shop.terminal.api.client.okhttp.TerminalOkHttpClient;

// Configures using the `TERMINAL_BEARER_TOKEN` and `TERMINAL_BASE_URL` environment variables
TerminalClient client = TerminalOkHttpClient.fromEnv();
```

Or manually:

```java
import shop.terminal.api.client.TerminalClient;
import shop.terminal.api.client.okhttp.TerminalOkHttpClient;

TerminalClient client = TerminalOkHttpClient.builder()
    .bearerToken("My Bearer Token")
    .build();
```

Or using a combination of the two approaches:

```java
import shop.terminal.api.client.TerminalClient;
import shop.terminal.api.client.okhttp.TerminalOkHttpClient;

TerminalClient client = TerminalOkHttpClient.builder()
    // Configures using the `TERMINAL_BEARER_TOKEN` and `TERMINAL_BASE_URL` environment variables
    .fromEnv()
    .appId("My App ID")
    .build();
```

See this table for the available options:

| Setter        | Environment variable    | Required | Default value                 |
| ------------- | ----------------------- | -------- | ----------------------------- |
| `bearerToken` | `TERMINAL_BEARER_TOKEN` | true     | -                             |
| `baseUrl`     | `TERMINAL_BASE_URL`     | true     | `"https://api.terminal.shop"` |

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

## Requests and responses

To send a request to the Terminal API, build an instance of some `Params` class and pass it to the corresponding client method. When the response is received, it will be deserialized into an instance of a Java class.

For example, `client.product().list(...)` should be called with an instance of `ProductListParams`, and it will return an instance of `ProductListResponse`.

## Immutability

Each class in the SDK has an associated [builder](https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java) or factory method for constructing it.

Each class is [immutable](https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html) once constructed. If the class has an associated builder, then it has a `toBuilder()` method, which can be used to convert it back to a builder for making a modified copy.

Because each class is immutable, builder modification will _never_ affect already built class instances.

## Asynchronous execution

The default client is synchronous. To switch to asynchronous execution, call the `async()` method:

```java
import java.util.concurrent.CompletableFuture;
import shop.terminal.api.client.TerminalClient;
import shop.terminal.api.client.okhttp.TerminalOkHttpClient;
import shop.terminal.api.models.product.ProductListParams;
import shop.terminal.api.models.product.ProductListResponse;

// Configures using the `TERMINAL_BEARER_TOKEN` and `TERMINAL_BASE_URL` environment variables
TerminalClient client = TerminalOkHttpClient.fromEnv();

CompletableFuture<ProductListResponse> products = client.async().product().list();
```

Or create an asynchronous client from the beginning:

```java
import java.util.concurrent.CompletableFuture;
import shop.terminal.api.client.TerminalClientAsync;
import shop.terminal.api.client.okhttp.TerminalOkHttpClientAsync;
import shop.terminal.api.models.product.ProductListParams;
import shop.terminal.api.models.product.ProductListResponse;

// Configures using the `TERMINAL_BEARER_TOKEN` and `TERMINAL_BASE_URL` environment variables
TerminalClientAsync client = TerminalOkHttpClientAsync.fromEnv();

CompletableFuture<ProductListResponse> products = client.product().list();
```

The asynchronous client supports the same options as the synchronous one, except most methods return `CompletableFuture`s.

## Raw responses

The SDK defines methods that deserialize responses into instances of Java classes. However, these methods don't provide access to the response headers, status code, or the raw response body.

To access this data, prefix any HTTP method call on a client or service with `withRawResponse()`:

```java
import shop.terminal.api.core.http.Headers;
import shop.terminal.api.core.http.HttpResponseFor;
import shop.terminal.api.models.product.ProductListParams;
import shop.terminal.api.models.product.ProductListResponse;

HttpResponseFor<ProductListResponse> products = client.product().withRawResponse().list();

int statusCode = products.statusCode();
Headers headers = products.headers();
```

You can still deserialize the response into an instance of a Java class if needed:

```java
import shop.terminal.api.models.product.ProductListResponse;

ProductListResponse parsedProducts = products.parse();
```

## Error handling

The SDK throws custom unchecked exception types:

- [`TerminalServiceException`](terminal-java-core/src/main/kotlin/shop/terminal/api/errors/TerminalServiceException.kt): Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                                                                                                                       |
  | ------ | ------------------------------------------------------------------------------------------------------------------------------- |
  | 400    | [`BadRequestException`](terminal-java-core/src/main/kotlin/shop/terminal/api/errors/BadRequestException.kt)                     |
  | 401    | [`UnauthorizedException`](terminal-java-core/src/main/kotlin/shop/terminal/api/errors/UnauthorizedException.kt)                 |
  | 403    | [`PermissionDeniedException`](terminal-java-core/src/main/kotlin/shop/terminal/api/errors/PermissionDeniedException.kt)         |
  | 404    | [`NotFoundException`](terminal-java-core/src/main/kotlin/shop/terminal/api/errors/NotFoundException.kt)                         |
  | 422    | [`UnprocessableEntityException`](terminal-java-core/src/main/kotlin/shop/terminal/api/errors/UnprocessableEntityException.kt)   |
  | 429    | [`RateLimitException`](terminal-java-core/src/main/kotlin/shop/terminal/api/errors/RateLimitException.kt)                       |
  | 5xx    | [`InternalServerException`](terminal-java-core/src/main/kotlin/shop/terminal/api/errors/InternalServerException.kt)             |
  | others | [`UnexpectedStatusCodeException`](terminal-java-core/src/main/kotlin/shop/terminal/api/errors/UnexpectedStatusCodeException.kt) |

- [`TerminalIoException`](terminal-java-core/src/main/kotlin/shop/terminal/api/errors/TerminalIoException.kt): I/O networking errors.

- [`TerminalInvalidDataException`](terminal-java-core/src/main/kotlin/shop/terminal/api/errors/TerminalInvalidDataException.kt): Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- [`TerminalException`](terminal-java-core/src/main/kotlin/shop/terminal/api/errors/TerminalException.kt): Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

## Logging

The SDK uses the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

Enable logging by setting the `TERMINAL_LOG` environment variable to `info`:

```sh
$ export TERMINAL_LOG=info
```

Or to `debug` for more verbose logging:

```sh
$ export TERMINAL_LOG=debug
```

## Jackson

The SDK depends on [Jackson](https://github.com/FasterXML/jackson) for JSON serialization/deserialization. It is compatible with version 2.13.4 or higher, but depends on version 2.18.2 by default.

The SDK throws an exception if it detects an incompatible Jackson version at runtime (e.g. if the default version was overridden in your Maven or Gradle config).

If the SDK threw an exception, but you're _certain_ the version is compatible, then disable the version check using the `checkJacksonVersionCompatibility` on [`TerminalOkHttpClient`](terminal-java-client-okhttp/src/main/kotlin/shop/terminal/api/client/okhttp/TerminalOkHttpClient.kt) or [`TerminalOkHttpClientAsync`](terminal-java-client-okhttp/src/main/kotlin/shop/terminal/api/client/okhttp/TerminalOkHttpClientAsync.kt).

> [!CAUTION]
> We make no guarantee that the SDK works correctly when the Jackson version check is disabled.

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

The API may also explicitly instruct the SDK to retry or not retry a response.

To set a custom number of retries, configure the client using the `maxRetries` method:

```java
import shop.terminal.api.client.TerminalClient;
import shop.terminal.api.client.okhttp.TerminalOkHttpClient;

TerminalClient client = TerminalOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default.

To set a custom timeout, configure the method call using the `timeout` method:

```java
import shop.terminal.api.models.product.ProductListParams;
import shop.terminal.api.models.product.ProductListResponse;

ProductListResponse products = client.product().list(RequestOptions.builder().timeout(Duration.ofSeconds(30)).build());
```

Or configure the default for all method calls at the client level:

```java
import java.time.Duration;
import shop.terminal.api.client.TerminalClient;
import shop.terminal.api.client.okhttp.TerminalOkHttpClient;

TerminalClient client = TerminalOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build();
```

### Proxies

To route requests through a proxy, configure the client using the `proxy` method:

```java
import java.net.InetSocketAddress;
import java.net.Proxy;
import shop.terminal.api.client.TerminalClient;
import shop.terminal.api.client.okhttp.TerminalOkHttpClient;

TerminalClient client = TerminalOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(
      Proxy.Type.HTTP, new InetSocketAddress(
        "https://example.com", 8080
      )
    ))
    .build();
```

### Environments

The SDK sends requests to the production by default. To send requests to a different environment, configure the client like so:

```java
import shop.terminal.api.client.TerminalClient;
import shop.terminal.api.client.okhttp.TerminalOkHttpClient;

TerminalClient client = TerminalOkHttpClient.builder()
    .fromEnv()
    .dev()
    .build();
```

### Custom HTTP client

The SDK consists of three artifacts:

- `terminal-java-core`
  - Contains core SDK logic
  - Does not depend on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`TerminalClient`](terminal-java-core/src/main/kotlin/shop/terminal/api/client/TerminalClient.kt), [`TerminalClientAsync`](terminal-java-core/src/main/kotlin/shop/terminal/api/client/TerminalClientAsync.kt), [`TerminalClientImpl`](terminal-java-core/src/main/kotlin/shop/terminal/api/client/TerminalClientImpl.kt), and [`TerminalClientAsyncImpl`](terminal-java-core/src/main/kotlin/shop/terminal/api/client/TerminalClientAsyncImpl.kt), all of which can work with any HTTP client
- `terminal-java-client-okhttp`
  - Depends on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`TerminalOkHttpClient`](terminal-java-client-okhttp/src/main/kotlin/shop/terminal/api/client/okhttp/TerminalOkHttpClient.kt) and [`TerminalOkHttpClientAsync`](terminal-java-client-okhttp/src/main/kotlin/shop/terminal/api/client/okhttp/TerminalOkHttpClientAsync.kt), which provide a way to construct [`TerminalClientImpl`](terminal-java-core/src/main/kotlin/shop/terminal/api/client/TerminalClientImpl.kt) and [`TerminalClientAsyncImpl`](terminal-java-core/src/main/kotlin/shop/terminal/api/client/TerminalClientAsyncImpl.kt), respectively, using OkHttp
- `terminal-java`
  - Depends on and exposes the APIs of both `terminal-java-core` and `terminal-java-client-okhttp`
  - Does not have its own logic

This structure allows replacing the SDK's default HTTP client without pulling in unnecessary dependencies.

#### Customized [`OkHttpClient`](https://square.github.io/okhttp/3.x/okhttp/okhttp3/OkHttpClient.html)

> [!TIP]
> Try the available [network options](#network-options) before replacing the default client.

To use a customized `OkHttpClient`:

1. Replace your [`terminal-java` dependency](#installation) with `terminal-java-core`
2. Copy `terminal-java-client-okhttp`'s [`OkHttpClient`](terminal-java-client-okhttp/src/main/kotlin/shop/terminal/api/client/okhttp/OkHttpClient.kt) class into your code and customize it
3. Construct [`TerminalClientImpl`](terminal-java-core/src/main/kotlin/shop/terminal/api/client/TerminalClientImpl.kt) or [`TerminalClientAsyncImpl`](terminal-java-core/src/main/kotlin/shop/terminal/api/client/TerminalClientAsyncImpl.kt), similarly to [`TerminalOkHttpClient`](terminal-java-client-okhttp/src/main/kotlin/shop/terminal/api/client/okhttp/TerminalOkHttpClient.kt) or [`TerminalOkHttpClientAsync`](terminal-java-client-okhttp/src/main/kotlin/shop/terminal/api/client/okhttp/TerminalOkHttpClientAsync.kt), using your customized client

### Completely custom HTTP client

To use a completely custom HTTP client:

1. Replace your [`terminal-java` dependency](#installation) with `terminal-java-core`
2. Write a class that implements the [`HttpClient`](terminal-java-core/src/main/kotlin/shop/terminal/api/core/http/HttpClient.kt) interface
3. Construct [`TerminalClientImpl`](terminal-java-core/src/main/kotlin/shop/terminal/api/client/TerminalClientImpl.kt) or [`TerminalClientAsyncImpl`](terminal-java-core/src/main/kotlin/shop/terminal/api/client/TerminalClientAsyncImpl.kt), similarly to [`TerminalOkHttpClient`](terminal-java-client-okhttp/src/main/kotlin/shop/terminal/api/client/okhttp/TerminalOkHttpClient.kt) or [`TerminalOkHttpClientAsync`](terminal-java-client-okhttp/src/main/kotlin/shop/terminal/api/client/okhttp/TerminalOkHttpClientAsync.kt), using your new client class

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```java
import shop.terminal.api.core.JsonValue;
import shop.terminal.api.models.product.ProductListParams;

ProductListParams params = ProductListParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build();
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a [`JsonValue`](terminal-java-core/src/main/kotlin/shop/terminal/api/core/Values.kt) object to its setter:

```java
import shop.terminal.api.models.product.ProductListParams;

ProductListParams params = ProductListParams.builder().build();
```

The most straightforward way to create a [`JsonValue`](terminal-java-core/src/main/kotlin/shop/terminal/api/core/Values.kt) is using its `from(...)` method:

```java
import java.util.List;
import java.util.Map;
import shop.terminal.api.core.JsonValue;

// Create primitive JSON values
JsonValue nullValue = JsonValue.from(null);
JsonValue booleanValue = JsonValue.from(true);
JsonValue numberValue = JsonValue.from(42);
JsonValue stringValue = JsonValue.from("Hello World!");

// Create a JSON array value equivalent to `["Hello", "World"]`
JsonValue arrayValue = JsonValue.from(List.of(
  "Hello", "World"
));

// Create a JSON object value equivalent to `{ "a": 1, "b": 2 }`
JsonValue objectValue = JsonValue.from(Map.of(
  "a", 1,
  "b", 2
));

// Create an arbitrarily nested JSON equivalent to:
// {
//   "a": [1, 2],
//   "b": [3, 4]
// }
JsonValue complexValue = JsonValue.from(Map.of(
  "a", List.of(
    1, 2
  ),
  "b", List.of(
    3, 4
  )
));
```

Normally a `Builder` class's `build` method will throw [`IllegalStateException`](https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalStateException.html) if any required parameter or property is unset.

To forcibly omit a required parameter or property, pass [`JsonMissing`](terminal-java-core/src/main/kotlin/shop/terminal/api/core/Values.kt):

```java
import shop.terminal.api.core.JsonMissing;
import shop.terminal.api.models.product.ProductGetParams;
import shop.terminal.api.models.product.ProductListParams;

ProductListParams params = ProductGetParams.builder()
    .id(JsonMissing.of())
    .build();
```

### Response properties

To access undocumented response properties, call the `_additionalProperties()` method:

```java
import java.util.Map;
import shop.terminal.api.core.JsonValue;

Map<String, JsonValue> additionalProperties = client.product().list(params)._additionalProperties();
JsonValue secretPropertyValue = additionalProperties.get("secretProperty");

String result = secretPropertyValue.accept(new JsonValue.Visitor<>() {
    @Override
    public String visitNull() {
        return "It's null!";
    }

    @Override
    public String visitBoolean(boolean value) {
        return "It's a boolean!";
    }

    @Override
    public String visitNumber(Number value) {
        return "It's a number!";
    }

    // Other methods include `visitMissing`, `visitString`, `visitArray`, and `visitObject`
    // The default implementation of each unimplemented method delegates to `visitDefault`, which throws by default, but can also be overridden
});
```

To access a property's raw JSON value, which may be undocumented, call its `_` prefixed method:

```java
import java.util.Optional;
import shop.terminal.api.core.JsonField;

JsonField<Object> field = client.product().list(params)._field();

if (field.isMissing()) {
  // The property is absent from the JSON response
} else if (field.isNull()) {
  // The property was set to literal null
} else {
  // Check if value was provided as a string
  // Other methods include `asNumber()`, `asBoolean()`, etc.
  Optional<String> jsonString = field.asString();

  // Try to deserialize into a custom type
  MyClass myObject = field.asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Response validation

In rare cases, the API may return a response that doesn't match the expected type. For example, the SDK may expect a property to contain a `String`, but the API could return something else.

By default, the SDK will not throw an exception in this case. It will throw [`TerminalInvalidDataException`](terminal-java-core/src/main/kotlin/shop/terminal/api/errors/TerminalInvalidDataException.kt) only if you directly access the property.

If you would prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```java
import shop.terminal.api.models.product.ProductListResponse;

ProductListResponse products = client.product().list(params).validate();
```

Or configure the method call to validate the response using the `responseValidation` method:

```java
import shop.terminal.api.models.product.ProductListParams;
import shop.terminal.api.models.product.ProductListResponse;

ProductListResponse products = client.product().list(RequestOptions.builder().responseValidation(true).build());
```

Or configure the default for all method calls at the client level:

```java
import shop.terminal.api.client.TerminalClient;
import shop.terminal.api.client.okhttp.TerminalOkHttpClient;

TerminalClient client = TerminalOkHttpClient.builder()
    .fromEnv()
    .responseValidation(true)
    .build();
```

## FAQ

### Why don't you use plain `enum` classes?

Java `enum` classes are not trivially [forwards compatible](https://www.stainless.com/blog/making-java-enums-forwards-compatible). Using them in the SDK could cause runtime exceptions if the API is updated to respond with a new enum value.

### Why do you represent fields using `JsonField<T>` instead of just plain `T`?

Using `JsonField<T>` enables a few features:

- Allowing usage of [undocumented API functionality](#undocumented-api-functionality)
- Lazily [validating the API response against the expected shape](#response-validation)
- Representing absent vs explicitly null values

### Why don't you use [`data` classes](https://kotlinlang.org/docs/data-classes.html)?

It is not [backwards compatible to add new fields to a data class](https://kotlinlang.org/docs/api-guidelines-backward-compatibility.html#avoid-using-data-classes-in-your-api) and we don't want to introduce a breaking change every time we add a field to a class.

### Why don't you use checked exceptions?

Checked exceptions are widely considered a mistake in the Java programming language. In fact, they were omitted from Kotlin for this reason.

Checked exceptions:

- Are verbose to handle
- Encourage error handling at the wrong level of abstraction, where nothing can be done about the error
- Are tedious to propagate due to the [function coloring problem](https://journal.stuffwithstuff.com/2015/02/01/what-color-is-your-function)
- Don't play well with lambdas (also due to the function coloring problem)

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/terminaldotshop/terminal-sdk-java/issues) with questions, bugs, or suggestions.
