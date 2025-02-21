# Terminal Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/shop.terminal.api/terminal-java)](https://central.sonatype.com/artifact/shop.terminal.api/terminal-java/0.1.0-alpha.8)

<!-- x-release-please-end -->

The Terminal Java SDK provides convenient access to the Terminal REST API from applications written in Java.

The Terminal Java SDK is similar to the Terminal Kotlin SDK but with minor differences that make it more ergonomic for use in Java, such as `Optional` instead of nullable values, `Stream` instead of `Sequence`, and `CompletableFuture` instead of suspend functions.

It is generated with [Stainless](https://www.stainlessapi.com/).

The REST API documentation can be found on [terminal.shop](https://terminal.shop/docs).

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("shop.terminal.api:terminal-java:0.1.0-alpha.8")
```

### Maven

```xml
<dependency>
    <groupId>shop.terminal.api</groupId>
    <artifactId>terminal-java</artifactId>
    <version>0.1.0-alpha.8</version>
</dependency>
```

<!-- x-release-please-end -->

## Requirements

This library requires Java 8 or later.

## Usage

```java
import shop.terminal.api.client.TerminalClient;
import shop.terminal.api.client.okhttp.TerminalOkHttpClient;
import shop.terminal.api.models.ProductListParams;
import shop.terminal.api.models.ProductListResponse;

// Configures using the `TERMINAL_BEARER_TOKEN` environment variable
TerminalClient client = TerminalOkHttpClient.fromEnv();

ProductListParams params = ProductListParams.builder().build();
ProductListResponse product = client.product().list(params);
```

## Client configuration

Configure the client using environment variables:

```java
import shop.terminal.api.client.TerminalClient;
import shop.terminal.api.client.okhttp.TerminalOkHttpClient;

// Configures using the `TERMINAL_BEARER_TOKEN` environment variable
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
    // Configures using the `TERMINAL_BEARER_TOKEN` environment variable
    .fromEnv()
    .bearerToken("My Bearer Token")
    .build();
```

See this table for the available options:

| Setter        | Environment variable    | Required | Default value |
| ------------- | ----------------------- | -------- | ------------- |
| `bearerToken` | `TERMINAL_BEARER_TOKEN` | true     | -             |

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

## Requests and responses

To send a request to the Terminal API, build an instance of some `Params` class and pass it to the corresponding client method. When the response is received, it will be deserialized into an instance of a Java class.

For example, `client.product().list(...)` should be called with an instance of `ProductListParams`, and it will return an instance of `ProductListResponse`.

## Asynchronous execution

The default client is synchronous. To switch to asynchronous execution, call the `async()` method:

```java
import java.util.concurrent.CompletableFuture;
import shop.terminal.api.client.TerminalClient;
import shop.terminal.api.client.okhttp.TerminalOkHttpClient;
import shop.terminal.api.models.ProductListParams;
import shop.terminal.api.models.ProductListResponse;

// Configures using the `TERMINAL_BEARER_TOKEN` environment variable
TerminalClient client = TerminalOkHttpClient.fromEnv();

ProductListParams params = ProductListParams.builder().build();
CompletableFuture<ProductListResponse> product = client.async().product().list(params);
```

Or create an asynchronous client from the beginning:

```java
import java.util.concurrent.CompletableFuture;
import shop.terminal.api.client.TerminalClientAsync;
import shop.terminal.api.client.okhttp.TerminalOkHttpClientAsync;
import shop.terminal.api.models.ProductListParams;
import shop.terminal.api.models.ProductListResponse;

// Configures using the `TERMINAL_BEARER_TOKEN` environment variable
TerminalClientAsync client = TerminalOkHttpClientAsync.fromEnv();

ProductListParams params = ProductListParams.builder().build();
CompletableFuture<ProductListResponse> product = client.product().list(params);
```

The asynchronous client supports the same options as the synchronous one, except most methods return `CompletableFuture`s.

## Error handling

The SDK throws custom unchecked exception types:

- `TerminalServiceException`: Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                       |
  | ------ | ------------------------------- |
  | 400    | `BadRequestException`           |
  | 401    | `AuthenticationException`       |
  | 403    | `PermissionDeniedException`     |
  | 404    | `NotFoundException`             |
  | 422    | `UnprocessableEntityException`  |
  | 429    | `RateLimitException`            |
  | 5xx    | `InternalServerException`       |
  | others | `UnexpectedStatusCodeException` |

- `TerminalIoException`: I/O networking errors.

- `TerminalInvalidDataException`: Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- `TerminalException`: Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

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
import shop.terminal.api.models.ProductListParams;
import shop.terminal.api.models.ProductListResponse;

ProductListResponse product = client.product().list(
  params, RequestOptions.builder().timeout(Duration.ofSeconds(30)).build()
);
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

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```java
import shop.terminal.api.core.JsonValue;
import shop.terminal.api.models.ProductListParams;

ProductListParams params = ProductListParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build();
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods. You can also set undocumented parameters on nested headers, query params, or body classes using the `putAdditionalProperty` method. These properties can be accessed on the built object later using the `_additionalProperties()` method.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a `JsonValue` object to its setter:

```java
import shop.terminal.api.models.ProductListParams;

ProductListParams params = ProductListParams.builder().build();
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

By default, the SDK will not throw an exception in this case. It will throw `TerminalInvalidDataException` only if you directly access the property.

If you would prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```java
import shop.terminal.api.models.ProductListResponse;

ProductListResponse product = client.product().list(params).validate();
```

Or configure the method call to validate the response using the `responseValidation` method:

```java
import shop.terminal.api.models.ProductListParams;
import shop.terminal.api.models.ProductListResponse;

ProductListResponse product = client.product().list(
  params, RequestOptions.builder().responseValidation(true).build()
);
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

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/terminaldotshop/terminal-sdk-java/issues) with questions, bugs, or suggestions.
