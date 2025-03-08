// File generated from our OpenAPI spec by Stainless.

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
import shop.terminal.api.models.CardGetParams
import shop.terminal.api.models.CardGetResponse
import shop.terminal.api.models.CardListParams
import shop.terminal.api.models.CardListResponse

interface CardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Attach a credit card (tokenized via Stripe) to the current user. */
    fun create(params: CardCreateParams): CompletableFuture<CardCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardCreateResponse>

    /** List the credit cards associated with the current user. */
    fun list(): CompletableFuture<CardListResponse> = list(CardListParams.none())

    /** @see [list] */
    fun list(
        params: CardListParams = CardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardListResponse>

    /** @see [list] */
    fun list(params: CardListParams = CardListParams.none()): CompletableFuture<CardListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<CardListResponse> =
        list(CardListParams.none(), requestOptions)

    /** Delete a credit card associated with the current user. */
    fun delete(params: CardDeleteParams): CompletableFuture<CardDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: CardDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDeleteResponse>

    /** Create a temporary URL for collecting credit card information for the current user. */
    fun collect(): CompletableFuture<CardCollectResponse> = collect(CardCollectParams.none())

    /** @see [collect] */
    fun collect(
        params: CardCollectParams = CardCollectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardCollectResponse>

    /** @see [collect] */
    fun collect(
        params: CardCollectParams = CardCollectParams.none()
    ): CompletableFuture<CardCollectResponse> = collect(params, RequestOptions.none())

    /** @see [collect] */
    fun collect(requestOptions: RequestOptions): CompletableFuture<CardCollectResponse> =
        collect(CardCollectParams.none(), requestOptions)

    /** Get a credit card by ID associated with the current user. */
    fun get(params: CardGetParams): CompletableFuture<CardGetResponse> =
        get(params, RequestOptions.none())

    /** @see [get] */
    fun get(
        params: CardGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardGetResponse>

    /** A view of [CardServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /card`, but is otherwise the same as
         * [CardServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: CardCreateParams
        ): CompletableFuture<HttpResponseFor<CardCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /card`, but is otherwise the same as
         * [CardServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<CardListResponse>> =
            list(CardListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CardListParams = CardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CardListParams = CardListParams.none()
        ): CompletableFuture<HttpResponseFor<CardListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CardListResponse>> =
            list(CardListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /card/{id}`, but is otherwise the same as
         * [CardServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: CardDeleteParams
        ): CompletableFuture<HttpResponseFor<CardDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CardDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDeleteResponse>>

        /**
         * Returns a raw HTTP response for `post /card/collect`, but is otherwise the same as
         * [CardServiceAsync.collect].
         */
        @MustBeClosed
        fun collect(): CompletableFuture<HttpResponseFor<CardCollectResponse>> =
            collect(CardCollectParams.none())

        /** @see [collect] */
        @MustBeClosed
        fun collect(
            params: CardCollectParams = CardCollectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardCollectResponse>>

        /** @see [collect] */
        @MustBeClosed
        fun collect(
            params: CardCollectParams = CardCollectParams.none()
        ): CompletableFuture<HttpResponseFor<CardCollectResponse>> =
            collect(params, RequestOptions.none())

        /** @see [collect] */
        @MustBeClosed
        fun collect(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CardCollectResponse>> =
            collect(CardCollectParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /card/{id}`, but is otherwise the same as
         * [CardServiceAsync.get].
         */
        @MustBeClosed
        fun get(params: CardGetParams): CompletableFuture<HttpResponseFor<CardGetResponse>> =
            get(params, RequestOptions.none())

        /** @see [get] */
        @MustBeClosed
        fun get(
            params: CardGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardGetResponse>>
    }
}
