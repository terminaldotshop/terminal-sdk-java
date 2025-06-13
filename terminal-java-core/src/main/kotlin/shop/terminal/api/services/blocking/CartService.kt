// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer
import shop.terminal.api.core.ClientOptions
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

interface CartService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CartService

    /** Clear the current user's cart. */
    fun clear(): CartClearResponse = clear(CartClearParams.none())

    /** @see [clear] */
    fun clear(
        params: CartClearParams = CartClearParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CartClearResponse

    /** @see [clear] */
    fun clear(params: CartClearParams = CartClearParams.none()): CartClearResponse =
        clear(params, RequestOptions.none())

    /** @see [clear] */
    fun clear(requestOptions: RequestOptions): CartClearResponse =
        clear(CartClearParams.none(), requestOptions)

    /** Convert the current user's cart to an order. */
    fun convert(): CartConvertResponse = convert(CartConvertParams.none())

    /** @see [convert] */
    fun convert(
        params: CartConvertParams = CartConvertParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CartConvertResponse

    /** @see [convert] */
    fun convert(params: CartConvertParams = CartConvertParams.none()): CartConvertResponse =
        convert(params, RequestOptions.none())

    /** @see [convert] */
    fun convert(requestOptions: RequestOptions): CartConvertResponse =
        convert(CartConvertParams.none(), requestOptions)

    /** Get the current user's cart. */
    fun get(): CartGetResponse = get(CartGetParams.none())

    /** @see [get] */
    fun get(
        params: CartGetParams = CartGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CartGetResponse

    /** @see [get] */
    fun get(params: CartGetParams = CartGetParams.none()): CartGetResponse =
        get(params, RequestOptions.none())

    /** @see [get] */
    fun get(requestOptions: RequestOptions): CartGetResponse =
        get(CartGetParams.none(), requestOptions)

    /** Set the shipping address for the current user's cart. */
    fun setAddress(params: CartSetAddressParams): CartSetAddressResponse =
        setAddress(params, RequestOptions.none())

    /** @see [setAddress] */
    fun setAddress(
        params: CartSetAddressParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CartSetAddressResponse

    /** Set the credit card for the current user's cart. */
    fun setCard(params: CartSetCardParams): CartSetCardResponse =
        setCard(params, RequestOptions.none())

    /** @see [setCard] */
    fun setCard(
        params: CartSetCardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CartSetCardResponse

    /** Add an item to the current user's cart. */
    fun setItem(params: CartSetItemParams): CartSetItemResponse =
        setItem(params, RequestOptions.none())

    /** @see [setItem] */
    fun setItem(
        params: CartSetItemParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CartSetItemResponse

    /** A view of [CartService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CartService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /cart`, but is otherwise the same as
         * [CartService.clear].
         */
        @MustBeClosed
        fun clear(): HttpResponseFor<CartClearResponse> = clear(CartClearParams.none())

        /** @see [clear] */
        @MustBeClosed
        fun clear(
            params: CartClearParams = CartClearParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CartClearResponse>

        /** @see [clear] */
        @MustBeClosed
        fun clear(
            params: CartClearParams = CartClearParams.none()
        ): HttpResponseFor<CartClearResponse> = clear(params, RequestOptions.none())

        /** @see [clear] */
        @MustBeClosed
        fun clear(requestOptions: RequestOptions): HttpResponseFor<CartClearResponse> =
            clear(CartClearParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cart/convert`, but is otherwise the same as
         * [CartService.convert].
         */
        @MustBeClosed
        fun convert(): HttpResponseFor<CartConvertResponse> = convert(CartConvertParams.none())

        /** @see [convert] */
        @MustBeClosed
        fun convert(
            params: CartConvertParams = CartConvertParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CartConvertResponse>

        /** @see [convert] */
        @MustBeClosed
        fun convert(
            params: CartConvertParams = CartConvertParams.none()
        ): HttpResponseFor<CartConvertResponse> = convert(params, RequestOptions.none())

        /** @see [convert] */
        @MustBeClosed
        fun convert(requestOptions: RequestOptions): HttpResponseFor<CartConvertResponse> =
            convert(CartConvertParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cart`, but is otherwise the same as
         * [CartService.get].
         */
        @MustBeClosed fun get(): HttpResponseFor<CartGetResponse> = get(CartGetParams.none())

        /** @see [get] */
        @MustBeClosed
        fun get(
            params: CartGetParams = CartGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CartGetResponse>

        /** @see [get] */
        @MustBeClosed
        fun get(params: CartGetParams = CartGetParams.none()): HttpResponseFor<CartGetResponse> =
            get(params, RequestOptions.none())

        /** @see [get] */
        @MustBeClosed
        fun get(requestOptions: RequestOptions): HttpResponseFor<CartGetResponse> =
            get(CartGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /cart/address`, but is otherwise the same as
         * [CartService.setAddress].
         */
        @MustBeClosed
        fun setAddress(params: CartSetAddressParams): HttpResponseFor<CartSetAddressResponse> =
            setAddress(params, RequestOptions.none())

        /** @see [setAddress] */
        @MustBeClosed
        fun setAddress(
            params: CartSetAddressParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CartSetAddressResponse>

        /**
         * Returns a raw HTTP response for `put /cart/card`, but is otherwise the same as
         * [CartService.setCard].
         */
        @MustBeClosed
        fun setCard(params: CartSetCardParams): HttpResponseFor<CartSetCardResponse> =
            setCard(params, RequestOptions.none())

        /** @see [setCard] */
        @MustBeClosed
        fun setCard(
            params: CartSetCardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CartSetCardResponse>

        /**
         * Returns a raw HTTP response for `put /cart/item`, but is otherwise the same as
         * [CartService.setItem].
         */
        @MustBeClosed
        fun setItem(params: CartSetItemParams): HttpResponseFor<CartSetItemResponse> =
            setItem(params, RequestOptions.none())

        /** @see [setItem] */
        @MustBeClosed
        fun setItem(
            params: CartSetItemParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CartSetItemResponse>
    }
}
