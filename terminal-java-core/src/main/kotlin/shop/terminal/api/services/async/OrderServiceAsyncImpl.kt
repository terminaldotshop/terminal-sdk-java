// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import java.util.concurrent.CompletableFuture
import shop.terminal.api.core.ClientOptions
import shop.terminal.api.core.JsonValue
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
import shop.terminal.api.models.order.OrderCreateParams
import shop.terminal.api.models.order.OrderCreateResponse
import shop.terminal.api.models.order.OrderGetParams
import shop.terminal.api.models.order.OrderGetResponse
import shop.terminal.api.models.order.OrderListParams
import shop.terminal.api.models.order.OrderListResponse

class OrderServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OrderServiceAsync {

    private val withRawResponse: OrderServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OrderServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: OrderCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrderCreateResponse> =
        // post /order
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: OrderListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrderListResponse> =
        // get /order
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: OrderGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrderGetResponse> =
        // get /order/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<OrderCreateResponse> =
            jsonHandler<OrderCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: OrderCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrderCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("order")
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

        private val listHandler: Handler<OrderListResponse> =
            jsonHandler<OrderListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: OrderListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrderListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("order")
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

        private val getHandler: Handler<OrderGetResponse> =
            jsonHandler<OrderGetResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun get(
            params: OrderGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrderGetResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("order", params._pathParam(0))
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
