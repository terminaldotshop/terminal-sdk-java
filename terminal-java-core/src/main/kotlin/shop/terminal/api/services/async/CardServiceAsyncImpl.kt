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
import shop.terminal.api.core.json
import shop.terminal.api.core.prepareAsync
import shop.terminal.api.errors.TerminalError
import shop.terminal.api.models.CardCollectParams
import shop.terminal.api.models.CardCollectResponse
import shop.terminal.api.models.CardCreateParams
import shop.terminal.api.models.CardCreateResponse
import shop.terminal.api.models.CardDeleteParams
import shop.terminal.api.models.CardDeleteResponse
import shop.terminal.api.models.CardListParams
import shop.terminal.api.models.CardListResponse

class CardServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : CardServiceAsync {

    private val errorHandler: Handler<TerminalError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<CardCreateResponse> =
        jsonHandler<CardCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Attach a credit card (tokenized via Stripe) to the current user. */
    override fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CardCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("card")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<CardListResponse> =
        jsonHandler<CardListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** List the credit cards associated with the current user. */
    override fun list(
        params: CardListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CardListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("card")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val deleteHandler: Handler<CardDeleteResponse> =
        jsonHandler<CardDeleteResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a credit card associated with the current user. */
    override fun delete(
        params: CardDeleteParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CardDeleteResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("card", params.getPathParam(0))
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val collectHandler: Handler<CardCollectResponse> =
        jsonHandler<CardCollectResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a temporary URL for collecting credit card information for the current user. */
    override fun collect(
        params: CardCollectParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CardCollectResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("card", "collect")
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { collectHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
