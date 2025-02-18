// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.api.services.blocking

import shop.terminal.api.core.RequestOptions
import shop.terminal.api.models.SubscriptionCreateParams
import shop.terminal.api.models.SubscriptionCreateResponse
import shop.terminal.api.models.SubscriptionDeleteParams
import shop.terminal.api.models.SubscriptionDeleteResponse
import shop.terminal.api.models.SubscriptionListParams
import shop.terminal.api.models.SubscriptionListResponse

interface SubscriptionService {

    /** Create a subscription for the current user. */
    @JvmOverloads
    fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionCreateResponse

    /** List the subscriptions associated with the current user. */
    @JvmOverloads
    fun list(
        params: SubscriptionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListResponse

    /** Cancel a subscription for the current user. */
    @JvmOverloads
    fun delete(
        params: SubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionDeleteResponse
}
