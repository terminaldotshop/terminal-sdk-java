// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.view.ViewInitParams
import shop.terminal.api.models.view.ViewInitResponse

interface ViewServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get initial app data, including user, products, cart, addresses, cards,
     * subscriptions, and orders.
     */
    fun init(): CompletableFuture<ViewInitResponse> = init(ViewInitParams.none())

    /** @see [init] */
    fun init(params: ViewInitParams = ViewInitParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ViewInitResponse>

    /** @see [init] */
    fun init(params: ViewInitParams = ViewInitParams.none()): CompletableFuture<ViewInitResponse> =
        init(
          params, RequestOptions.none()
        )

    /** @see [init] */
    fun init(requestOptions: RequestOptions): CompletableFuture<ViewInitResponse> = init(ViewInitParams.none(), requestOptions)

    /**
     * A view of [ViewServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /view/init`, but is otherwise the same as
         * [ViewServiceAsync.init].
         */
        @MustBeClosed
        fun init(): CompletableFuture<HttpResponseFor<ViewInitResponse>> = init(ViewInitParams.none())

        /** @see [init] */
        @MustBeClosed
        fun init(params: ViewInitParams = ViewInitParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ViewInitResponse>>

        /** @see [init] */
        @MustBeClosed
        fun init(params: ViewInitParams = ViewInitParams.none()): CompletableFuture<HttpResponseFor<ViewInitResponse>> =
            init(
              params, RequestOptions.none()
            )

        /** @see [init] */
        @MustBeClosed
        fun init(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ViewInitResponse>> = init(ViewInitParams.none(), requestOptions)
    }
}
