// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import java.util.concurrent.CompletableFuture
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.token.TokenCreateParams
import shop.terminal.api.models.token.TokenCreateResponse
import shop.terminal.api.models.token.TokenDeleteParams
import shop.terminal.api.models.token.TokenDeleteResponse
import shop.terminal.api.models.token.TokenGetParams
import shop.terminal.api.models.token.TokenGetResponse
import shop.terminal.api.models.token.TokenListParams
import shop.terminal.api.models.token.TokenListResponse

interface TokenServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a personal access token. */
    fun create(): CompletableFuture<TokenCreateResponse> = create(TokenCreateParams.none())

    /** @see [create] */
    fun create(
        params: TokenCreateParams = TokenCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenCreateResponse>

    /** @see [create] */
    fun create(
        params: TokenCreateParams = TokenCreateParams.none()
    ): CompletableFuture<TokenCreateResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): CompletableFuture<TokenCreateResponse> =
        create(TokenCreateParams.none(), requestOptions)

    /** List the current user's personal access tokens. */
    fun list(): CompletableFuture<TokenListResponse> = list(TokenListParams.none())

    /** @see [list] */
    fun list(
        params: TokenListParams = TokenListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenListResponse>

    /** @see [list] */
    fun list(
        params: TokenListParams = TokenListParams.none()
    ): CompletableFuture<TokenListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<TokenListResponse> =
        list(TokenListParams.none(), requestOptions)

    /** Delete the personal access token with the given ID. */
    fun delete(id: String): CompletableFuture<TokenDeleteResponse> =
        delete(id, TokenDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: TokenDeleteParams = TokenDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: TokenDeleteParams = TokenDeleteParams.none(),
    ): CompletableFuture<TokenDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: TokenDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenDeleteResponse>

    /** @see [delete] */
    fun delete(params: TokenDeleteParams): CompletableFuture<TokenDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<TokenDeleteResponse> =
        delete(id, TokenDeleteParams.none(), requestOptions)

    /** Get the personal access token with the given ID. */
    fun get(id: String): CompletableFuture<TokenGetResponse> = get(id, TokenGetParams.none())

    /** @see [get] */
    fun get(
        id: String,
        params: TokenGetParams = TokenGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenGetResponse> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see [get] */
    fun get(
        id: String,
        params: TokenGetParams = TokenGetParams.none(),
    ): CompletableFuture<TokenGetResponse> = get(id, params, RequestOptions.none())

    /** @see [get] */
    fun get(
        params: TokenGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenGetResponse>

    /** @see [get] */
    fun get(params: TokenGetParams): CompletableFuture<TokenGetResponse> =
        get(params, RequestOptions.none())

    /** @see [get] */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<TokenGetResponse> =
        get(id, TokenGetParams.none(), requestOptions)

    /** A view of [TokenServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /token`, but is otherwise the same as
         * [TokenServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<TokenCreateResponse>> =
            create(TokenCreateParams.none())

        /** @see [create] */
        fun create(
            params: TokenCreateParams = TokenCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenCreateResponse>>

        /** @see [create] */
        fun create(
            params: TokenCreateParams = TokenCreateParams.none()
        ): CompletableFuture<HttpResponseFor<TokenCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TokenCreateResponse>> =
            create(TokenCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /token`, but is otherwise the same as
         * [TokenServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TokenListResponse>> =
            list(TokenListParams.none())

        /** @see [list] */
        fun list(
            params: TokenListParams = TokenListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenListResponse>>

        /** @see [list] */
        fun list(
            params: TokenListParams = TokenListParams.none()
        ): CompletableFuture<HttpResponseFor<TokenListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TokenListResponse>> =
            list(TokenListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /token/{id}`, but is otherwise the same as
         * [TokenServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<TokenDeleteResponse>> =
            delete(id, TokenDeleteParams.none())

        /** @see [delete] */
        fun delete(
            id: String,
            params: TokenDeleteParams = TokenDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            id: String,
            params: TokenDeleteParams = TokenDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<TokenDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: TokenDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenDeleteResponse>>

        /** @see [delete] */
        fun delete(
            params: TokenDeleteParams
        ): CompletableFuture<HttpResponseFor<TokenDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TokenDeleteResponse>> =
            delete(id, TokenDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /token/{id}`, but is otherwise the same as
         * [TokenServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<TokenGetResponse>> =
            get(id, TokenGetParams.none())

        /** @see [get] */
        fun get(
            id: String,
            params: TokenGetParams = TokenGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see [get] */
        fun get(
            id: String,
            params: TokenGetParams = TokenGetParams.none(),
        ): CompletableFuture<HttpResponseFor<TokenGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see [get] */
        fun get(
            params: TokenGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenGetResponse>>

        /** @see [get] */
        fun get(params: TokenGetParams): CompletableFuture<HttpResponseFor<TokenGetResponse>> =
            get(params, RequestOptions.none())

        /** @see [get] */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TokenGetResponse>> =
            get(id, TokenGetParams.none(), requestOptions)
    }
}
