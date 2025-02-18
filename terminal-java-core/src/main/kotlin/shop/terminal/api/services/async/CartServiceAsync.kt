// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.api.services.async

import java.util.concurrent.CompletableFuture
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.models.CartConvertParams
import shop.terminal.api.models.CartConvertResponse
import shop.terminal.api.models.CartGetParams
import shop.terminal.api.models.CartGetResponse
import shop.terminal.api.models.CartSetAddressParams
import shop.terminal.api.models.CartSetAddressResponse
import shop.terminal.api.models.CartSetCardParams
import shop.terminal.api.models.CartSetCardResponse
import shop.terminal.api.models.CartSetItemParams
import shop.terminal.api.models.CartSetItemResponse

interface CartServiceAsync {

    /** Convert the current user's cart to an order. */
    @JvmOverloads
    fun convert(
        params: CartConvertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CartConvertResponse>

    /** Get the current user's cart. */
    @JvmOverloads
    fun get(
        params: CartGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CartGetResponse>

    /** Set the shipping address for the current user's cart. */
    @JvmOverloads
    fun setAddress(
        params: CartSetAddressParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CartSetAddressResponse>

    /** Set the credit card for the current user's cart. */
    @JvmOverloads
    fun setCard(
        params: CartSetCardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CartSetCardResponse>

    /** Add an item to the current user's cart. */
    @JvmOverloads
    fun setItem(
        params: CartSetItemParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CartSetItemResponse>
}
