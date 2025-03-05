// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import shop.terminal.api.core.ClientOptions
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.handlers.errorHandler
import shop.terminal.api.core.handlers.jsonHandler
import shop.terminal.api.core.handlers.withErrorHandler
import shop.terminal.api.core.http.HttpMethod
import shop.terminal.api.core.http.HttpRequest
import shop.terminal.api.core.http.HttpResponse.Handler
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.core.http.parseable
import shop.terminal.api.core.json
import shop.terminal.api.core.prepare
import shop.terminal.api.errors.TerminalError
import shop.terminal.api.models.AppCreateParams
import shop.terminal.api.models.AppCreateResponse
import shop.terminal.api.models.AppDeleteParams
import shop.terminal.api.models.AppDeleteResponse
import shop.terminal.api.models.AppGetParams
import shop.terminal.api.models.AppGetResponse
import shop.terminal.api.models.AppListParams
import shop.terminal.api.models.AppListResponse

class AppServiceImpl internal constructor(private val clientOptions: ClientOptions) : AppService {

    private val withRawResponse: AppService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AppService.WithRawResponse = withRawResponse

    override fun create(
        params: AppCreateParams,
        requestOptions: RequestOptions,
    ): AppCreateResponse =
        // post /app
        withRawResponse().create(params, requestOptions).parse()

    override fun list(params: AppListParams, requestOptions: RequestOptions): AppListResponse =
        // get /app
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: AppDeleteParams,
        requestOptions: RequestOptions,
    ): AppDeleteResponse =
        // delete /app/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun get(params: AppGetParams, requestOptions: RequestOptions): AppGetResponse =
        // get /app/{id}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AppService.WithRawResponse {

        private val errorHandler: Handler<TerminalError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AppCreateResponse> =
            jsonHandler<AppCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: AppCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AppCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("app")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<AppListResponse> =
            jsonHandler<AppListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: AppListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AppListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("app")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<AppDeleteResponse> =
            jsonHandler<AppDeleteResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: AppDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AppDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("app", params.getPathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getHandler: Handler<AppGetResponse> =
            jsonHandler<AppGetResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun get(
            params: AppGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AppGetResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("app", params.getPathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
