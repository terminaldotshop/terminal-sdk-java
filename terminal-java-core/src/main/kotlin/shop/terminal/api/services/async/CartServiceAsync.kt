// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
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

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Convert the current user's cart to an order. */
    @JvmOverloads
    fun convert(
        params: CartConvertParams = CartConvertParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CartConvertResponse>

    /** Convert the current user's cart to an order. */
    fun convert(requestOptions: RequestOptions): CompletableFuture<CartConvertResponse> =
        convert(CartConvertParams.none(), requestOptions)

    /** Get the current user's cart. */
    @JvmOverloads
    fun get(
        params: CartGetParams = CartGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CartGetResponse>

    /** Get the current user's cart. */
    fun get(requestOptions: RequestOptions): CompletableFuture<CartGetResponse> =
        get(CartGetParams.none(), requestOptions)

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

    /** A view of [CartServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /cart/convert`, but is otherwise the same as
         * [CartServiceAsync.convert].
         */
        @JvmOverloads
        @MustBeClosed
        fun convert(
            params: CartConvertParams = CartConvertParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CartConvertResponse>>

        /**
         * Returns a raw HTTP response for `post /cart/convert`, but is otherwise the same as
         * [CartServiceAsync.convert].
         */
        @MustBeClosed
        fun convert(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CartConvertResponse>> =
            convert(CartConvertParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cart`, but is otherwise the same as
         * [CartServiceAsync.get].
         */
        @JvmOverloads
        @MustBeClosed
        fun get(
            params: CartGetParams = CartGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CartGetResponse>>

        /**
         * Returns a raw HTTP response for `get /cart`, but is otherwise the same as
         * [CartServiceAsync.get].
         */
        @MustBeClosed
        fun get(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CartGetResponse>> =
            get(CartGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /cart/address`, but is otherwise the same as
         * [CartServiceAsync.setAddress].
         */
        @JvmOverloads
        @MustBeClosed
        fun setAddress(
            params: CartSetAddressParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CartSetAddressResponse>>

        /**
         * Returns a raw HTTP response for `put /cart/card`, but is otherwise the same as
         * [CartServiceAsync.setCard].
         */
        @JvmOverloads
        @MustBeClosed
        fun setCard(
            params: CartSetCardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CartSetCardResponse>>

        /**
         * Returns a raw HTTP response for `put /cart/item`, but is otherwise the same as
         * [CartServiceAsync.setItem].
         */
        @JvmOverloads
        @MustBeClosed
        fun setItem(
            params: CartSetItemParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CartSetItemResponse>>
    }
}
