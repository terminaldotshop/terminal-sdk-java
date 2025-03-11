// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import java.util.concurrent.CompletableFuture
import shop.terminal.api.core.ClientOptions
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.handlers.errorHandler
import shop.terminal.api.core.handlers.jsonHandler
import shop.terminal.api.core.handlers.withErrorHandler
import shop.terminal.api.core.http.HttpMethod
import shop.terminal.api.core.http.HttpRequest
import shop.terminal.api.core.http.HttpResponse.Handler
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.core.http.json
import shop.terminal.api.core.http.parseable
import shop.terminal.api.core.prepareAsync
import shop.terminal.api.errors.TerminalError
import shop.terminal.api.models.address.AddressCreateParams
import shop.terminal.api.models.address.AddressCreateResponse
import shop.terminal.api.models.address.AddressDeleteParams
import shop.terminal.api.models.address.AddressDeleteResponse
import shop.terminal.api.models.address.AddressGetParams
import shop.terminal.api.models.address.AddressGetResponse
import shop.terminal.api.models.address.AddressListParams
import shop.terminal.api.models.address.AddressListResponse

class AddressServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AddressServiceAsync {

    private val withRawResponse: AddressServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AddressServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: AddressCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AddressCreateResponse> =
        // post /address
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AddressListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AddressListResponse> =
        // get /address
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AddressDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AddressDeleteResponse> =
        // delete /address/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: AddressGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AddressGetResponse> =
        // get /address/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AddressServiceAsync.WithRawResponse {

        private val errorHandler: Handler<TerminalError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AddressCreateResponse> =
            jsonHandler<AddressCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: AddressCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddressCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("address")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<AddressListResponse> =
            jsonHandler<AddressListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: AddressListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddressListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("address")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<AddressDeleteResponse> =
            jsonHandler<AddressDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: AddressDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddressDeleteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("address", params.getPathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getHandler: Handler<AddressGetResponse> =
            jsonHandler<AddressGetResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun get(
            params: AddressGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddressGetResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("address", params.getPathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
