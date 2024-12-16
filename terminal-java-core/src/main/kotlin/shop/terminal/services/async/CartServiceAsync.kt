// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.services.async

import java.util.concurrent.CompletableFuture
import shop.terminal.core.RequestOptions
import shop.terminal.models.CartListParams
import shop.terminal.models.CartListResponse
import shop.terminal.models.CartSetAddressParams
import shop.terminal.models.CartSetAddressResponse
import shop.terminal.models.CartSetCardParams
import shop.terminal.models.CartSetCardResponse
import shop.terminal.models.CartSetItemParams
import shop.terminal.models.CartSetItemResponse

interface CartServiceAsync {

    /** Get the current user's cart. */
    @JvmOverloads
    fun list(
        params: CartListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CartListResponse>

    /** Set the shipping address for the current user's cart. */
    @JvmOverloads
    fun setAddress(
        params: CartSetAddressParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CartSetAddressResponse>

    /** Set the credit card for the current user's cart. */
    @JvmOverloads
    fun setCard(
        params: CartSetCardParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CartSetCardResponse>

    /** Add an item to the current user's cart. */
    @JvmOverloads
    fun setItem(
        params: CartSetItemParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CartSetItemResponse>
}
