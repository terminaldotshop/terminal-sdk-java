// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.AppCreateParams
import shop.terminal.api.models.AppCreateResponse
import shop.terminal.api.models.AppDeleteParams
import shop.terminal.api.models.AppDeleteResponse
import shop.terminal.api.models.AppGetParams
import shop.terminal.api.models.AppGetResponse
import shop.terminal.api.models.AppListParams
import shop.terminal.api.models.AppListResponse

interface AppServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an app. */
    @JvmOverloads
    fun create(
        params: AppCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AppCreateResponse>

    /** List the current user's registered apps. */
    @JvmOverloads
    fun list(
        params: AppListParams = AppListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AppListResponse>

    /** List the current user's registered apps. */
    fun list(requestOptions: RequestOptions): CompletableFuture<AppListResponse> =
        list(AppListParams.none(), requestOptions)

    /** Delete the app with the given ID. */
    @JvmOverloads
    fun delete(
        params: AppDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AppDeleteResponse>

    /** Get the app with the given ID. */
    @JvmOverloads
    fun get(
        params: AppGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AppGetResponse>

    /** A view of [AppServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /app`, but is otherwise the same as
         * [AppServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: AppCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AppCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /app`, but is otherwise the same as
         * [AppServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: AppListParams = AppListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AppListResponse>>

        /**
         * Returns a raw HTTP response for `get /app`, but is otherwise the same as
         * [AppServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AppListResponse>> =
            list(AppListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /app/{id}`, but is otherwise the same as
         * [AppServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: AppDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AppDeleteResponse>>

        /**
         * Returns a raw HTTP response for `get /app/{id}`, but is otherwise the same as
         * [AppServiceAsync.get].
         */
        @JvmOverloads
        @MustBeClosed
        fun get(
            params: AppGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AppGetResponse>>
    }
}
