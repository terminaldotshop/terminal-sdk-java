// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.services.blocking

import shop.terminal.core.RequestOptions
import shop.terminal.models.ViewInitParams
import shop.terminal.models.ViewInitResponse

interface ViewService {

    /**
     * Get initial app data, including user, products, cart, addresses, cards, subscriptions, and
     * orders.
     */
    @JvmOverloads
    fun init(
        params: ViewInitParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ViewInitResponse
}
