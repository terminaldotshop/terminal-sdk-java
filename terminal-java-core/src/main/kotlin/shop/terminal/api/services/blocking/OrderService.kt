// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.order.OrderCreateParams
import shop.terminal.api.models.order.OrderCreateResponse
import shop.terminal.api.models.order.OrderGetParams
import shop.terminal.api.models.order.OrderGetResponse
import shop.terminal.api.models.order.OrderListParams
import shop.terminal.api.models.order.OrderListResponse

interface OrderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an order without a cart. The order will be placed immediately. */
    fun create(params: OrderCreateParams): OrderCreateResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: OrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderCreateResponse

    /** List the orders associated with the current user. */
    fun list(): OrderListResponse = list(OrderListParams.none())

    /** @see [list] */
    fun list(
        params: OrderListParams = OrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderListResponse

    /** @see [list] */
    fun list(params: OrderListParams = OrderListParams.none()): OrderListResponse =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): OrderListResponse =
        list(OrderListParams.none(), requestOptions)

    /** Get the order with the given ID. */
    fun get(params: OrderGetParams): OrderGetResponse = get(params, RequestOptions.none())

    /** @see [get] */
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
        @MustBeClosed
        fun create(params: OrderCreateParams): HttpResponseFor<OrderCreateResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: OrderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderCreateResponse>

        /**
         * Returns a raw HTTP response for `get /order`, but is otherwise the same as
         * [OrderService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<OrderListResponse> = list(OrderListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: OrderListParams = OrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: OrderListParams = OrderListParams.none()
        ): HttpResponseFor<OrderListResponse> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OrderListResponse> =
            list(OrderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /order/{id}`, but is otherwise the same as
         * [OrderService.get].
         */
        @MustBeClosed
        fun get(params: OrderGetParams): HttpResponseFor<OrderGetResponse> =
            get(params, RequestOptions.none())

        /** @see [get] */
        @MustBeClosed
        fun get(
            params: OrderGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderGetResponse>
    }
}
