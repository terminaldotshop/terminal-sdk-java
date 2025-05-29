// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import java.util.concurrent.CompletableFuture
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.cart.CartClearParams
import shop.terminal.api.models.cart.CartClearResponse
import shop.terminal.api.models.cart.CartConvertParams
import shop.terminal.api.models.cart.CartConvertResponse
import shop.terminal.api.models.cart.CartGetParams
import shop.terminal.api.models.cart.CartGetResponse
import shop.terminal.api.models.cart.CartSetAddressParams
import shop.terminal.api.models.cart.CartSetAddressResponse
import shop.terminal.api.models.cart.CartSetCardParams
import shop.terminal.api.models.cart.CartSetCardResponse
import shop.terminal.api.models.cart.CartSetItemParams
import shop.terminal.api.models.cart.CartSetItemResponse

interface CartServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Clear the current user's cart. */
    fun clear(): CompletableFuture<CartClearResponse> = clear(CartClearParams.none())

    /** @see [clear] */
    fun clear(
        params: CartClearParams = CartClearParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CartClearResponse>

    /** @see [clear] */
    fun clear(
        params: CartClearParams = CartClearParams.none()
    ): CompletableFuture<CartClearResponse> = clear(params, RequestOptions.none())

    /** @see [clear] */
    fun clear(requestOptions: RequestOptions): CompletableFuture<CartClearResponse> =
        clear(CartClearParams.none(), requestOptions)

    /** Convert the current user's cart to an order. */
    fun convert(): CompletableFuture<CartConvertResponse> = convert(CartConvertParams.none())

    /** @see [convert] */
    fun convert(
        params: CartConvertParams = CartConvertParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CartConvertResponse>

    /** @see [convert] */
    fun convert(
        params: CartConvertParams = CartConvertParams.none()
    ): CompletableFuture<CartConvertResponse> = convert(params, RequestOptions.none())

    /** @see [convert] */
    fun convert(requestOptions: RequestOptions): CompletableFuture<CartConvertResponse> =
        convert(CartConvertParams.none(), requestOptions)

    /** Get the current user's cart. */
    fun get(): CompletableFuture<CartGetResponse> = get(CartGetParams.none())

    /** @see [get] */
    fun get(
        params: CartGetParams = CartGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CartGetResponse>

    /** @see [get] */
    fun get(params: CartGetParams = CartGetParams.none()): CompletableFuture<CartGetResponse> =
        get(params, RequestOptions.none())

    /** @see [get] */
    fun get(requestOptions: RequestOptions): CompletableFuture<CartGetResponse> =
        get(CartGetParams.none(), requestOptions)

    /** Set the shipping address for the current user's cart. */
    fun setAddress(params: CartSetAddressParams): CompletableFuture<CartSetAddressResponse> =
        setAddress(params, RequestOptions.none())

    /** @see [setAddress] */
    fun setAddress(
        params: CartSetAddressParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CartSetAddressResponse>

    /** Set the credit card for the current user's cart. */
    fun setCard(params: CartSetCardParams): CompletableFuture<CartSetCardResponse> =
        setCard(params, RequestOptions.none())

    /** @see [setCard] */
    fun setCard(
        params: CartSetCardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CartSetCardResponse>

    /** Add an item to the current user's cart. */
    fun setItem(params: CartSetItemParams): CompletableFuture<CartSetItemResponse> =
        setItem(params, RequestOptions.none())

    /** @see [setItem] */
    fun setItem(
        params: CartSetItemParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CartSetItemResponse>

    /** A view of [CartServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `delete /cart`, but is otherwise the same as
         * [CartServiceAsync.clear].
         */
        fun clear(): CompletableFuture<HttpResponseFor<CartClearResponse>> =
            clear(CartClearParams.none())

        /** @see [clear] */
        fun clear(
            params: CartClearParams = CartClearParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CartClearResponse>>

        /** @see [clear] */
        fun clear(
            params: CartClearParams = CartClearParams.none()
        ): CompletableFuture<HttpResponseFor<CartClearResponse>> =
            clear(params, RequestOptions.none())

        /** @see [clear] */
        fun clear(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CartClearResponse>> =
            clear(CartClearParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cart/convert`, but is otherwise the same as
         * [CartServiceAsync.convert].
         */
        fun convert(): CompletableFuture<HttpResponseFor<CartConvertResponse>> =
            convert(CartConvertParams.none())

        /** @see [convert] */
        fun convert(
            params: CartConvertParams = CartConvertParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CartConvertResponse>>

        /** @see [convert] */
        fun convert(
            params: CartConvertParams = CartConvertParams.none()
        ): CompletableFuture<HttpResponseFor<CartConvertResponse>> =
            convert(params, RequestOptions.none())

        /** @see [convert] */
        fun convert(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CartConvertResponse>> =
            convert(CartConvertParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cart`, but is otherwise the same as
         * [CartServiceAsync.get].
         */
        fun get(): CompletableFuture<HttpResponseFor<CartGetResponse>> = get(CartGetParams.none())

        /** @see [get] */
        fun get(
            params: CartGetParams = CartGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CartGetResponse>>

        /** @see [get] */
        fun get(
            params: CartGetParams = CartGetParams.none()
        ): CompletableFuture<HttpResponseFor<CartGetResponse>> = get(params, RequestOptions.none())

        /** @see [get] */
        fun get(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CartGetResponse>> =
            get(CartGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /cart/address`, but is otherwise the same as
         * [CartServiceAsync.setAddress].
         */
        fun setAddress(
            params: CartSetAddressParams
        ): CompletableFuture<HttpResponseFor<CartSetAddressResponse>> =
            setAddress(params, RequestOptions.none())

        /** @see [setAddress] */
        fun setAddress(
            params: CartSetAddressParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CartSetAddressResponse>>

        /**
         * Returns a raw HTTP response for `put /cart/card`, but is otherwise the same as
         * [CartServiceAsync.setCard].
         */
        fun setCard(
            params: CartSetCardParams
        ): CompletableFuture<HttpResponseFor<CartSetCardResponse>> =
            setCard(params, RequestOptions.none())

        /** @see [setCard] */
        fun setCard(
            params: CartSetCardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CartSetCardResponse>>

        /**
         * Returns a raw HTTP response for `put /cart/item`, but is otherwise the same as
         * [CartServiceAsync.setItem].
         */
        fun setItem(
            params: CartSetItemParams
        ): CompletableFuture<HttpResponseFor<CartSetItemResponse>> =
            setItem(params, RequestOptions.none())

        /** @see [setItem] */
        fun setItem(
            params: CartSetItemParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CartSetItemResponse>>
    }
}
