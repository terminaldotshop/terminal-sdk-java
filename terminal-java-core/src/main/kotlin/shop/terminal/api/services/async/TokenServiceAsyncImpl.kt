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
import shop.terminal.api.models.TokenCreateParams
import shop.terminal.api.models.TokenCreateResponse
import shop.terminal.api.models.TokenDeleteParams
import shop.terminal.api.models.TokenDeleteResponse
import shop.terminal.api.models.TokenGetParams
import shop.terminal.api.models.TokenGetResponse
import shop.terminal.api.models.TokenListParams
import shop.terminal.api.models.TokenListResponse

class TokenServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : TokenServiceAsync {

    private val errorHandler: Handler<TerminalError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<TokenCreateResponse> =
        jsonHandler<TokenCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a personal access token. */
    override fun create(
        params: TokenCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<TokenCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("token")
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
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

    private val listHandler: Handler<TokenListResponse> =
        jsonHandler<TokenListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** List the current user's personal access tokens. */
    override fun list(
        params: TokenListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<TokenListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("token")
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

    private val deleteHandler: Handler<TokenDeleteResponse> =
        jsonHandler<TokenDeleteResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete the personal access token with the given ID. */
    override fun delete(
        params: TokenDeleteParams,
        requestOptions: RequestOptions
    ): CompletableFuture<TokenDeleteResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("token", params.getPathParam(0))
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

    private val getHandler: Handler<TokenGetResponse> =
        jsonHandler<TokenGetResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get the personal access token with the given ID. */
    override fun get(
        params: TokenGetParams,
        requestOptions: RequestOptions
    ): CompletableFuture<TokenGetResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("token", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
