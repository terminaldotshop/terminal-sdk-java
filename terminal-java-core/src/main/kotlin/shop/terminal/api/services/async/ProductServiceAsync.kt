// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.ProductGetParams
import shop.terminal.api.models.ProductGetResponse
import shop.terminal.api.models.ProductListParams
import shop.terminal.api.models.ProductListResponse

interface ProductServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** List all products for sale in the Terminal shop. */
    @JvmOverloads
    fun list(
        params: ProductListParams = ProductListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductListResponse>

    /** List all products for sale in the Terminal shop. */
    fun list(requestOptions: RequestOptions): CompletableFuture<ProductListResponse> =
        list(ProductListParams.none(), requestOptions)

    /** Get a product by ID from the Terminal shop. */
    @JvmOverloads
    fun get(
        params: ProductGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductGetResponse>

    /**
     * A view of [ProductServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /product`, but is otherwise the same as
         * [ProductServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ProductListParams = ProductListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductListResponse>>

        /**
         * Returns a raw HTTP response for `get /product`, but is otherwise the same as
         * [ProductServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProductListResponse>> =
            list(ProductListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /product/{id}`, but is otherwise the same as
         * [ProductServiceAsync.get].
         */
        @JvmOverloads
        @MustBeClosed
        fun get(
            params: ProductGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductGetResponse>>
    }
}
