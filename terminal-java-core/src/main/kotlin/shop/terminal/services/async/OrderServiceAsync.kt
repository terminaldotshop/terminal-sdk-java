// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.services.async

import java.util.concurrent.CompletableFuture
import shop.terminal.core.RequestOptions
import shop.terminal.models.OrderGetParams
import shop.terminal.models.OrderGetResponse
import shop.terminal.models.OrderListParams
import shop.terminal.models.OrderListResponse

interface OrderServiceAsync {

    /** List the orders associated with the current user. */
    @JvmOverloads
    fun list(
        params: OrderListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<OrderListResponse>

    /** Get the order with the given ID. */
    @JvmOverloads
    fun get(
        params: OrderGetParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<OrderGetResponse>
}