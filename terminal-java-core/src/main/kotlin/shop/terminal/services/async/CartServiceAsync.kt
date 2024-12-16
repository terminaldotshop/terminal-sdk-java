// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.services.async

import java.util.concurrent.CompletableFuture
import shop.terminal.core.RequestOptions
import shop.terminal.models.CartConvertParams
import shop.terminal.models.CartConvertResponse
import shop.terminal.models.CartGetParams
import shop.terminal.models.CartGetResponse
import shop.terminal.models.CartSetAddressParams
import shop.terminal.models.CartSetAddressResponse
import shop.terminal.models.CartSetCardParams
import shop.terminal.models.CartSetCardResponse
import shop.terminal.models.CartSetItemParams
import shop.terminal.models.CartSetItemResponse

interface CartServiceAsync {

    /** Convert the current user's cart to an order. */
    @JvmOverloads
    fun convert(
        params: CartConvertParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CartConvertResponse>

    /** Get the current user's cart. */
    @JvmOverloads
    fun get(
        params: CartGetParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CartGetResponse>

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
