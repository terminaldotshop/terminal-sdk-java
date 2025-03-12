// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import com.google.errorprone.annotations.MustBeClosed
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
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a personal access token. */
    fun create(): CompletableFuture<TokenCreateResponse> = create(TokenCreateParams.none())

    /** @see [create] */
    fun create(params: TokenCreateParams = TokenCreateParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<TokenCreateResponse>

    /** @see [create] */
    fun create(params: TokenCreateParams = TokenCreateParams.none()): CompletableFuture<TokenCreateResponse> =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(requestOptions: RequestOptions): CompletableFuture<TokenCreateResponse> = create(TokenCreateParams.none(), requestOptions)

    /** List the current user's personal access tokens. */
    fun list(): CompletableFuture<TokenListResponse> = list(TokenListParams.none())

    /** @see [list] */
    fun list(params: TokenListParams = TokenListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<TokenListResponse>

    /** @see [list] */
    fun list(params: TokenListParams = TokenListParams.none()): CompletableFuture<TokenListResponse> =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<TokenListResponse> = list(TokenListParams.none(), requestOptions)

    /** Delete the personal access token with the given ID. */
    fun delete(params: TokenDeleteParams): CompletableFuture<TokenDeleteResponse> =
        delete(
          params, RequestOptions.none()
        )

    /** @see [delete] */
    fun delete(params: TokenDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<TokenDeleteResponse>

    /** Get the personal access token with the given ID. */
    fun get(params: TokenGetParams): CompletableFuture<TokenGetResponse> =
        get(
          params, RequestOptions.none()
        )

    /** @see [get] */
    fun get(params: TokenGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<TokenGetResponse>

    /**
     * A view of [TokenServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /token`, but is otherwise the same as
         * [TokenServiceAsync.create].
         */
        @MustBeClosed
        fun create(): CompletableFuture<HttpResponseFor<TokenCreateResponse>> = create(TokenCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(params: TokenCreateParams = TokenCreateParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<TokenCreateResponse>>

        /** @see [create] */
        @MustBeClosed
        fun create(params: TokenCreateParams = TokenCreateParams.none()): CompletableFuture<HttpResponseFor<TokenCreateResponse>> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<TokenCreateResponse>> = create(TokenCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /token`, but is otherwise the same as
         * [TokenServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<TokenListResponse>> = list(TokenListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: TokenListParams = TokenListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<TokenListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(params: TokenListParams = TokenListParams.none()): CompletableFuture<HttpResponseFor<TokenListResponse>> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<TokenListResponse>> = list(TokenListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /token/{id}`, but is otherwise the same
         * as [TokenServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: TokenDeleteParams): CompletableFuture<HttpResponseFor<TokenDeleteResponse>> =
            delete(
              params, RequestOptions.none()
            )

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: TokenDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<TokenDeleteResponse>>

        /**
         * Returns a raw HTTP response for `get /token/{id}`, but is otherwise the same as
         * [TokenServiceAsync.get].
         */
        @MustBeClosed
        fun get(params: TokenGetParams): CompletableFuture<HttpResponseFor<TokenGetResponse>> =
            get(
              params, RequestOptions.none()
            )

        /** @see [get] */
        @MustBeClosed
        fun get(params: TokenGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<TokenGetResponse>>
    }
}
