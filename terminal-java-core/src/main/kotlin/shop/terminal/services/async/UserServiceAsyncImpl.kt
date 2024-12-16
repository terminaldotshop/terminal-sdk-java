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
import shop.terminal.models.UserInitParams
import shop.terminal.models.UserInitResponse
import shop.terminal.models.UserMeParams
import shop.terminal.models.UserMeResponse
import shop.terminal.models.UserUpdateParams
import shop.terminal.models.UserUpdateResponse

class UserServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : UserServiceAsync {

    private val errorHandler: Handler<TerminalError> = errorHandler(clientOptions.jsonMapper)

    private val updateHandler: Handler<UserUpdateResponse> =
        jsonHandler<UserUpdateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update the current user. */
    override fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<UserUpdateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("users", "me")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val initHandler: Handler<UserInitResponse> =
        jsonHandler<UserInitResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Get initial app data, including user, products, cart, addresses, cards, subscriptions, and
     * orders.
     */
    override fun init(
        params: UserInitParams,
        requestOptions: RequestOptions
    ): CompletableFuture<UserInitResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("users", "init")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { initHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val meHandler: Handler<UserMeResponse> =
        jsonHandler<UserMeResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get the current user. */
    override fun me(
        params: UserMeParams,
        requestOptions: RequestOptions
    ): CompletableFuture<UserMeResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("users", "me")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { meHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
