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
import shop.terminal.api.core.http.parseable
import shop.terminal.api.core.prepareAsync
import shop.terminal.api.models.view.ViewInitParams
import shop.terminal.api.models.view.ViewInitResponse

class ViewServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ViewServiceAsync {

    private val withRawResponse: ViewServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ViewServiceAsync.WithRawResponse = withRawResponse

    override fun init(
        params: ViewInitParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ViewInitResponse> =
        // get /view/init
        withRawResponse().init(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ViewServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val initHandler: Handler<ViewInitResponse> =
            jsonHandler<ViewInitResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun init(
            params: ViewInitParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ViewInitResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("view", "init")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { initHandler.handle(it) }
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
