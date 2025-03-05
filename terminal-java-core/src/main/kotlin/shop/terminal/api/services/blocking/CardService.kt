// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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

interface CardService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Attach a credit card (tokenized via Stripe) to the current user. */
    @JvmOverloads
    fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardCreateResponse

    /** List the credit cards associated with the current user. */
    @JvmOverloads
    fun list(
        params: CardListParams = CardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardListResponse

    /** List the credit cards associated with the current user. */
    fun list(requestOptions: RequestOptions): CardListResponse =
        list(CardListParams.none(), requestOptions)

    /** Delete a credit card associated with the current user. */
    @JvmOverloads
    fun delete(
        params: CardDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDeleteResponse

    /** Create a temporary URL for collecting credit card information for the current user. */
    @JvmOverloads
    fun collect(
        params: CardCollectParams = CardCollectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardCollectResponse

    /** Create a temporary URL for collecting credit card information for the current user. */
    fun collect(requestOptions: RequestOptions): CardCollectResponse =
        collect(CardCollectParams.none(), requestOptions)

    /** A view of [CardService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /card`, but is otherwise the same as
         * [CardService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: CardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardCreateResponse>

        /**
         * Returns a raw HTTP response for `get /card`, but is otherwise the same as
         * [CardService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: CardListParams = CardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardListResponse>

        /**
         * Returns a raw HTTP response for `get /card`, but is otherwise the same as
         * [CardService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CardListResponse> =
            list(CardListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /card/{id}`, but is otherwise the same as
         * [CardService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: CardDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDeleteResponse>

        /**
         * Returns a raw HTTP response for `post /card/collect`, but is otherwise the same as
         * [CardService.collect].
         */
        @JvmOverloads
        @MustBeClosed
        fun collect(
            params: CardCollectParams = CardCollectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardCollectResponse>

        /**
         * Returns a raw HTTP response for `post /card/collect`, but is otherwise the same as
         * [CardService.collect].
         */
        @MustBeClosed
        fun collect(requestOptions: RequestOptions): HttpResponseFor<CardCollectResponse> =
            collect(CardCollectParams.none(), requestOptions)
    }
}
