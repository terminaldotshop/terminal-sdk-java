// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import shop.terminal.api.core.ClientOptions
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.card.CardCollectParams
import shop.terminal.api.models.card.CardCollectResponse
import shop.terminal.api.models.card.CardCreateParams
import shop.terminal.api.models.card.CardCreateResponse
import shop.terminal.api.models.card.CardDeleteParams
import shop.terminal.api.models.card.CardDeleteResponse
import shop.terminal.api.models.card.CardGetParams
import shop.terminal.api.models.card.CardGetResponse
import shop.terminal.api.models.card.CardListParams
import shop.terminal.api.models.card.CardListResponse

interface CardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardServiceAsync

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
    fun delete(id: String): CompletableFuture<CardDeleteResponse> =
        delete(id, CardDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: CardDeleteParams = CardDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: CardDeleteParams = CardDeleteParams.none(),
    ): CompletableFuture<CardDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: CardDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDeleteResponse>

    /** @see [delete] */
    fun delete(params: CardDeleteParams): CompletableFuture<CardDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<CardDeleteResponse> =
        delete(id, CardDeleteParams.none(), requestOptions)

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
    fun get(id: String): CompletableFuture<CardGetResponse> = get(id, CardGetParams.none())

    /** @see [get] */
    fun get(
        id: String,
        params: CardGetParams = CardGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardGetResponse> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see [get] */
    fun get(
        id: String,
        params: CardGetParams = CardGetParams.none(),
    ): CompletableFuture<CardGetResponse> = get(id, params, RequestOptions.none())

    /** @see [get] */
    fun get(
        params: CardGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardGetResponse>

    /** @see [get] */
    fun get(params: CardGetParams): CompletableFuture<CardGetResponse> =
        get(params, RequestOptions.none())

    /** @see [get] */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<CardGetResponse> =
        get(id, CardGetParams.none(), requestOptions)

    /** A view of [CardServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /card`, but is otherwise the same as
         * [CardServiceAsync.create].
         */
        fun create(
            params: CardCreateParams
        ): CompletableFuture<HttpResponseFor<CardCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: CardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /card`, but is otherwise the same as
         * [CardServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CardListResponse>> =
            list(CardListParams.none())

        /** @see [list] */
        fun list(
            params: CardListParams = CardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardListResponse>>

        /** @see [list] */
        fun list(
            params: CardListParams = CardListParams.none()
        ): CompletableFuture<HttpResponseFor<CardListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CardListResponse>> =
            list(CardListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /card/{id}`, but is otherwise the same as
         * [CardServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<CardDeleteResponse>> =
            delete(id, CardDeleteParams.none())

        /** @see [delete] */
        fun delete(
            id: String,
            params: CardDeleteParams = CardDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            id: String,
            params: CardDeleteParams = CardDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<CardDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: CardDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDeleteResponse>>

        /** @see [delete] */
        fun delete(
            params: CardDeleteParams
        ): CompletableFuture<HttpResponseFor<CardDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardDeleteResponse>> =
            delete(id, CardDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /card/collect`, but is otherwise the same as
         * [CardServiceAsync.collect].
         */
        fun collect(): CompletableFuture<HttpResponseFor<CardCollectResponse>> =
            collect(CardCollectParams.none())

        /** @see [collect] */
        fun collect(
            params: CardCollectParams = CardCollectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardCollectResponse>>

        /** @see [collect] */
        fun collect(
            params: CardCollectParams = CardCollectParams.none()
        ): CompletableFuture<HttpResponseFor<CardCollectResponse>> =
            collect(params, RequestOptions.none())

        /** @see [collect] */
        fun collect(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CardCollectResponse>> =
            collect(CardCollectParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /card/{id}`, but is otherwise the same as
         * [CardServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<CardGetResponse>> =
            get(id, CardGetParams.none())

        /** @see [get] */
        fun get(
            id: String,
            params: CardGetParams = CardGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see [get] */
        fun get(
            id: String,
            params: CardGetParams = CardGetParams.none(),
        ): CompletableFuture<HttpResponseFor<CardGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see [get] */
        fun get(
            params: CardGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardGetResponse>>

        /** @see [get] */
        fun get(params: CardGetParams): CompletableFuture<HttpResponseFor<CardGetResponse>> =
            get(params, RequestOptions.none())

        /** @see [get] */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardGetResponse>> =
            get(id, CardGetParams.none(), requestOptions)
    }
}
