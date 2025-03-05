// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.OrderCreateParams
import shop.terminal.api.models.OrderCreateResponse
import shop.terminal.api.models.OrderGetParams
import shop.terminal.api.models.OrderGetResponse
import shop.terminal.api.models.OrderListParams
import shop.terminal.api.models.OrderListResponse

interface OrderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an order without a cart. The order will be placed immediately. */
    @JvmOverloads
    fun create(
        params: OrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderCreateResponse

    /** List the orders associated with the current user. */
    @JvmOverloads
    fun list(
        params: OrderListParams = OrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderListResponse

    /** List the orders associated with the current user. */
    fun list(requestOptions: RequestOptions): OrderListResponse =
        list(OrderListParams.none(), requestOptions)

    /** Get the order with the given ID. */
    @JvmOverloads
    fun get(
        params: OrderGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderGetResponse

    /** A view of [OrderService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /order`, but is otherwise the same as
         * [OrderService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: OrderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderCreateResponse>

        /**
         * Returns a raw HTTP response for `get /order`, but is otherwise the same as
         * [OrderService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: OrderListParams = OrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderListResponse>

        /**
         * Returns a raw HTTP response for `get /order`, but is otherwise the same as
         * [OrderService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OrderListResponse> =
            list(OrderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /order/{id}`, but is otherwise the same as
         * [OrderService.get].
         */
        @JvmOverloads
        @MustBeClosed
        fun get(
            params: OrderGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderGetResponse>
    }
}
