// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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

interface TokenService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a personal access token. */
    fun create(): TokenCreateResponse = create(TokenCreateParams.none())

    /** @see [create] */
    fun create(
        params: TokenCreateParams = TokenCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenCreateResponse

    /** @see [create] */
    fun create(params: TokenCreateParams = TokenCreateParams.none()): TokenCreateResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): TokenCreateResponse =
        create(TokenCreateParams.none(), requestOptions)

    /** List the current user's personal access tokens. */
    fun list(): TokenListResponse = list(TokenListParams.none())

    /** @see [list] */
    fun list(
        params: TokenListParams = TokenListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenListResponse

    /** @see [list] */
    fun list(params: TokenListParams = TokenListParams.none()): TokenListResponse =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): TokenListResponse =
        list(TokenListParams.none(), requestOptions)

    /** Delete the personal access token with the given ID. */
    fun delete(params: TokenDeleteParams): TokenDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: TokenDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenDeleteResponse

    /** Get the personal access token with the given ID. */
    fun get(params: TokenGetParams): TokenGetResponse = get(params, RequestOptions.none())

    /** @see [get] */
    fun get(
        params: TokenGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenGetResponse

    /** A view of [TokenService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /token`, but is otherwise the same as
         * [TokenService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<TokenCreateResponse> = create(TokenCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: TokenCreateParams = TokenCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenCreateResponse>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: TokenCreateParams = TokenCreateParams.none()
        ): HttpResponseFor<TokenCreateResponse> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<TokenCreateResponse> =
            create(TokenCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /token`, but is otherwise the same as
         * [TokenService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<TokenListResponse> = list(TokenListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TokenListParams = TokenListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TokenListParams = TokenListParams.none()
        ): HttpResponseFor<TokenListResponse> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TokenListResponse> =
            list(TokenListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /token/{id}`, but is otherwise the same as
         * [TokenService.delete].
         */
        @MustBeClosed
        fun delete(params: TokenDeleteParams): HttpResponseFor<TokenDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: TokenDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenDeleteResponse>

        /**
         * Returns a raw HTTP response for `get /token/{id}`, but is otherwise the same as
         * [TokenService.get].
         */
        @MustBeClosed
        fun get(params: TokenGetParams): HttpResponseFor<TokenGetResponse> =
            get(params, RequestOptions.none())

        /** @see [get] */
        @MustBeClosed
        fun get(
            params: TokenGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenGetResponse>
    }
}
