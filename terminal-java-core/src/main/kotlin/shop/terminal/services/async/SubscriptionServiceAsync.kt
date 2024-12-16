// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.services.async

import java.util.concurrent.CompletableFuture
import shop.terminal.core.RequestOptions
import shop.terminal.models.SubscriptionCreateParams
import shop.terminal.models.SubscriptionCreateResponse
import shop.terminal.models.SubscriptionDeleteParams
import shop.terminal.models.SubscriptionDeleteResponse
import shop.terminal.models.SubscriptionListParams
import shop.terminal.models.SubscriptionListResponse

interface SubscriptionServiceAsync {

    /** Create a subscription for the current user. */
    @JvmOverloads
    fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<SubscriptionCreateResponse>

    /** List the subscriptions associated with the current user. */
    @JvmOverloads
    fun list(
        params: SubscriptionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<SubscriptionListResponse>

    /** Cancel a subscription for the current user. */
    @JvmOverloads
    fun delete(
        params: SubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<SubscriptionDeleteResponse>
}
