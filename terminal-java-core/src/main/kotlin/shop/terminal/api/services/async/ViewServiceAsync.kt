// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.api.services.async

import java.util.concurrent.CompletableFuture
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.models.ViewInitParams
import shop.terminal.api.models.ViewInitResponse

interface ViewServiceAsync {

    /**
     * Get initial app data, including user, products, cart, addresses, cards, subscriptions, and
     * orders.
     */
    @JvmOverloads
    fun init(
        params: ViewInitParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ViewInitResponse>
}