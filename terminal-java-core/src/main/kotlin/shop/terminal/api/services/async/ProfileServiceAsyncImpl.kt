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
import shop.terminal.api.models.ProfileMeParams
import shop.terminal.api.models.ProfileMeResponse
import shop.terminal.api.models.ProfileUpdateParams
import shop.terminal.api.models.ProfileUpdateResponse

class ProfileServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ProfileServiceAsync {

    private val errorHandler: Handler<TerminalError> = errorHandler(clientOptions.jsonMapper)

    private val updateHandler: Handler<ProfileUpdateResponse> =
        jsonHandler<ProfileUpdateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update the current user's profile. */
    override fun update(
        params: ProfileUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProfileUpdateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("profile")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val meHandler: Handler<ProfileMeResponse> =
        jsonHandler<ProfileMeResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get the current user's profile. */
    override fun me(
        params: ProfileMeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProfileMeResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("profile")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { meHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
