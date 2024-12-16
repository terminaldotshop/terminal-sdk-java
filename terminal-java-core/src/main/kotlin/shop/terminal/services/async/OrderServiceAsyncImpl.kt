// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.async

import java.util.concurrent.CompletableFuture
import shop.terminal.core.ClientOptions
import shop.terminal.core.RequestOptions
import shop.terminal.core.handlers.errorHandler
import shop.terminal.core.handlers.jsonHandler
import shop.terminal.core.handlers.withErrorHandler
import shop.terminal.core.http.HttpMethod
import shop.terminal.core.http.HttpRequest
import shop.terminal.core.http.HttpResponse.Handler
import shop.terminal.core.json
import shop.terminal.errors.TerminalError
import shop.terminal.models.OrderCreateParams
import shop.terminal.models.OrderCreateResponse
import shop.terminal.models.OrderGetParams
import shop.terminal.models.OrderGetResponse
import shop.terminal.models.OrderListParams
import shop.terminal.models.OrderListResponse

class OrderServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : OrderServiceAsync {

    private val errorHandler: Handler<TerminalError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<OrderCreateResponse> =
        jsonHandler<OrderCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create an order from the current user's cart. */
    override fun create(
        params: OrderCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<OrderCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("orders")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<OrderListResponse> =
        jsonHandler<OrderListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** List the orders associated with the current user. */
    override fun list(
        params: OrderListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<OrderListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("orders")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val getHandler: Handler<OrderGetResponse> =
        jsonHandler<OrderGetResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get the order with the given ID. */
    override fun get(
        params: OrderGetParams,
        requestOptions: RequestOptions
    ): CompletableFuture<OrderGetResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("orders", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { getHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
