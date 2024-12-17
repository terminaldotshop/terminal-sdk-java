// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.services.async

import java.util.concurrent.CompletableFuture
import shop.terminal.core.RequestOptions
import shop.terminal.models.AppDeleteParams
import shop.terminal.models.AppDeleteResponse
import shop.terminal.models.AppGetParams
import shop.terminal.models.AppGetResponse
import shop.terminal.models.AppListParams
import shop.terminal.models.AppListResponse

interface AppServiceAsync {

    /** List the current user's registered apps. */
    @JvmOverloads
    fun list(
        params: AppListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AppListResponse>

    /** Delete the app with the given ID. */
    @JvmOverloads
    fun delete(
        params: AppDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AppDeleteResponse>

    /** Get the app with the given ID. */
    @JvmOverloads
    fun get(
        params: AppGetParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AppGetResponse>
}
