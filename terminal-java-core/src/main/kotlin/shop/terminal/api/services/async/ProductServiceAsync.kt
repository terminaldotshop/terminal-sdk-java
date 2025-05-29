// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import java.util.concurrent.CompletableFuture
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.product.ProductGetParams
import shop.terminal.api.models.product.ProductGetResponse
import shop.terminal.api.models.product.ProductListParams
import shop.terminal.api.models.product.ProductListResponse

interface ProductServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** List all products for sale in the Terminal shop. */
    fun list(): CompletableFuture<ProductListResponse> = list(ProductListParams.none())

    /** @see [list] */
    fun list(
        params: ProductListParams = ProductListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductListResponse>

    /** @see [list] */
    fun list(
        params: ProductListParams = ProductListParams.none()
    ): CompletableFuture<ProductListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ProductListResponse> =
        list(ProductListParams.none(), requestOptions)

    /** Get a product by ID from the Terminal shop. */
    fun get(id: String): CompletableFuture<ProductGetResponse> = get(id, ProductGetParams.none())

    /** @see [get] */
    fun get(
        id: String,
        params: ProductGetParams = ProductGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see [get] */
    fun get(
        id: String,
        params: ProductGetParams = ProductGetParams.none(),
    ): CompletableFuture<ProductGetResponse> = get(id, params, RequestOptions.none())

    /** @see [get] */
    fun get(
        params: ProductGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductGetResponse>

    /** @see [get] */
    fun get(params: ProductGetParams): CompletableFuture<ProductGetResponse> =
        get(params, RequestOptions.none())

    /** @see [get] */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<ProductGetResponse> =
        get(id, ProductGetParams.none(), requestOptions)

    /**
     * A view of [ProductServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /product`, but is otherwise the same as
         * [ProductServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ProductListResponse>> =
            list(ProductListParams.none())

        /** @see [list] */
        fun list(
            params: ProductListParams = ProductListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductListResponse>>

        /** @see [list] */
        fun list(
            params: ProductListParams = ProductListParams.none()
        ): CompletableFuture<HttpResponseFor<ProductListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProductListResponse>> =
            list(ProductListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /product/{id}`, but is otherwise the same as
         * [ProductServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<ProductGetResponse>> =
            get(id, ProductGetParams.none())

        /** @see [get] */
        fun get(
            id: String,
            params: ProductGetParams = ProductGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see [get] */
        fun get(
            id: String,
            params: ProductGetParams = ProductGetParams.none(),
        ): CompletableFuture<HttpResponseFor<ProductGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see [get] */
        fun get(
            params: ProductGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductGetResponse>>

        /** @see [get] */
        fun get(params: ProductGetParams): CompletableFuture<HttpResponseFor<ProductGetResponse>> =
            get(params, RequestOptions.none())

        /** @see [get] */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProductGetResponse>> =
            get(id, ProductGetParams.none(), requestOptions)
    }
}
