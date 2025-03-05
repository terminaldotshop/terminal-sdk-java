// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.CardCollectParams
import shop.terminal.api.models.CardCollectResponse
import shop.terminal.api.models.CardCreateParams
import shop.terminal.api.models.CardCreateResponse
import shop.terminal.api.models.CardDeleteParams
import shop.terminal.api.models.CardDeleteResponse
import shop.terminal.api.models.CardListParams
import shop.terminal.api.models.CardListResponse

interface CardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Attach a credit card (tokenized via Stripe) to the current user. */
    @JvmOverloads
    fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardCreateResponse>

    /** List the credit cards associated with the current user. */
    @JvmOverloads
    fun list(
        params: CardListParams = CardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardListResponse>

    /** List the credit cards associated with the current user. */
    fun list(requestOptions: RequestOptions): CompletableFuture<CardListResponse> =
        list(CardListParams.none(), requestOptions)

    /** Delete a credit card associated with the current user. */
    @JvmOverloads
    fun delete(
        params: CardDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDeleteResponse>

    /** Create a temporary URL for collecting credit card information for the current user. */
    @JvmOverloads
    fun collect(
        params: CardCollectParams = CardCollectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardCollectResponse>

    /** Create a temporary URL for collecting credit card information for the current user. */
    fun collect(requestOptions: RequestOptions): CompletableFuture<CardCollectResponse> =
        collect(CardCollectParams.none(), requestOptions)

    /** A view of [CardServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /card`, but is otherwise the same as
         * [CardServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: CardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /card`, but is otherwise the same as
         * [CardServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: CardListParams = CardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardListResponse>>

        /**
         * Returns a raw HTTP response for `get /card`, but is otherwise the same as
         * [CardServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CardListResponse>> =
            list(CardListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /card/{id}`, but is otherwise the same as
         * [CardServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: CardDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDeleteResponse>>

        /**
         * Returns a raw HTTP response for `post /card/collect`, but is otherwise the same as
         * [CardServiceAsync.collect].
         */
        @JvmOverloads
        @MustBeClosed
        fun collect(
            params: CardCollectParams = CardCollectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardCollectResponse>>

        /**
         * Returns a raw HTTP response for `post /card/collect`, but is otherwise the same as
         * [CardServiceAsync.collect].
         */
        @MustBeClosed
        fun collect(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CardCollectResponse>> =
            collect(CardCollectParams.none(), requestOptions)
    }
}
