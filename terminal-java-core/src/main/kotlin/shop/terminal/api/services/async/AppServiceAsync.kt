// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import java.util.concurrent.CompletableFuture
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.app.AppCreateParams
import shop.terminal.api.models.app.AppCreateResponse
import shop.terminal.api.models.app.AppDeleteParams
import shop.terminal.api.models.app.AppDeleteResponse
import shop.terminal.api.models.app.AppGetParams
import shop.terminal.api.models.app.AppGetResponse
import shop.terminal.api.models.app.AppListParams
import shop.terminal.api.models.app.AppListResponse

interface AppServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an app. */
    fun create(params: AppCreateParams): CompletableFuture<AppCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: AppCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AppCreateResponse>

    /** List the current user's registered apps. */
    fun list(): CompletableFuture<AppListResponse> = list(AppListParams.none())

    /** @see [list] */
    fun list(
        params: AppListParams = AppListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AppListResponse>

    /** @see [list] */
    fun list(params: AppListParams = AppListParams.none()): CompletableFuture<AppListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<AppListResponse> =
        list(AppListParams.none(), requestOptions)

    /** Delete the app with the given ID. */
    fun delete(id: String): CompletableFuture<AppDeleteResponse> =
        delete(id, AppDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: AppDeleteParams = AppDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AppDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: AppDeleteParams = AppDeleteParams.none(),
    ): CompletableFuture<AppDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: AppDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AppDeleteResponse>

    /** @see [delete] */
    fun delete(params: AppDeleteParams): CompletableFuture<AppDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<AppDeleteResponse> =
        delete(id, AppDeleteParams.none(), requestOptions)

    /** Get the app with the given ID. */
    fun get(id: String): CompletableFuture<AppGetResponse> = get(id, AppGetParams.none())

    /** @see [get] */
    fun get(
        id: String,
        params: AppGetParams = AppGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AppGetResponse> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see [get] */
    fun get(
        id: String,
        params: AppGetParams = AppGetParams.none(),
    ): CompletableFuture<AppGetResponse> = get(id, params, RequestOptions.none())

    /** @see [get] */
    fun get(
        params: AppGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AppGetResponse>

    /** @see [get] */
    fun get(params: AppGetParams): CompletableFuture<AppGetResponse> =
        get(params, RequestOptions.none())

    /** @see [get] */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<AppGetResponse> =
        get(id, AppGetParams.none(), requestOptions)

    /** A view of [AppServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /app`, but is otherwise the same as
         * [AppServiceAsync.create].
         */
        fun create(params: AppCreateParams): CompletableFuture<HttpResponseFor<AppCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: AppCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AppCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /app`, but is otherwise the same as
         * [AppServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AppListResponse>> = list(AppListParams.none())

        /** @see [list] */
        fun list(
            params: AppListParams = AppListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AppListResponse>>

        /** @see [list] */
        fun list(
            params: AppListParams = AppListParams.none()
        ): CompletableFuture<HttpResponseFor<AppListResponse>> = list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AppListResponse>> =
            list(AppListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /app/{id}`, but is otherwise the same as
         * [AppServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<AppDeleteResponse>> =
            delete(id, AppDeleteParams.none())

        /** @see [delete] */
        fun delete(
            id: String,
            params: AppDeleteParams = AppDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AppDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            id: String,
            params: AppDeleteParams = AppDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<AppDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: AppDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AppDeleteResponse>>

        /** @see [delete] */
        fun delete(params: AppDeleteParams): CompletableFuture<HttpResponseFor<AppDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AppDeleteResponse>> =
            delete(id, AppDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /app/{id}`, but is otherwise the same as
         * [AppServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<AppGetResponse>> =
            get(id, AppGetParams.none())

        /** @see [get] */
        fun get(
            id: String,
            params: AppGetParams = AppGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AppGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see [get] */
        fun get(
            id: String,
            params: AppGetParams = AppGetParams.none(),
        ): CompletableFuture<HttpResponseFor<AppGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see [get] */
        fun get(
            params: AppGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AppGetResponse>>

        /** @see [get] */
        fun get(params: AppGetParams): CompletableFuture<HttpResponseFor<AppGetResponse>> =
            get(params, RequestOptions.none())

        /** @see [get] */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AppGetResponse>> =
            get(id, AppGetParams.none(), requestOptions)
    }
}
