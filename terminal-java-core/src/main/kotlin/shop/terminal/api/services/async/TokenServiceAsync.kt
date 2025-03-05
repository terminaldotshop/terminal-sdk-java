// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.TokenCreateParams
import shop.terminal.api.models.TokenCreateResponse
import shop.terminal.api.models.TokenDeleteParams
import shop.terminal.api.models.TokenDeleteResponse
import shop.terminal.api.models.TokenGetParams
import shop.terminal.api.models.TokenGetResponse
import shop.terminal.api.models.TokenListParams
import shop.terminal.api.models.TokenListResponse

interface TokenServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a personal access token. */
    @JvmOverloads
    fun create(
        params: TokenCreateParams = TokenCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenCreateResponse>

    /** Create a personal access token. */
    fun create(requestOptions: RequestOptions): CompletableFuture<TokenCreateResponse> =
        create(TokenCreateParams.none(), requestOptions)

    /** List the current user's personal access tokens. */
    @JvmOverloads
    fun list(
        params: TokenListParams = TokenListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenListResponse>

    /** List the current user's personal access tokens. */
    fun list(requestOptions: RequestOptions): CompletableFuture<TokenListResponse> =
        list(TokenListParams.none(), requestOptions)

    /** Delete the personal access token with the given ID. */
    @JvmOverloads
    fun delete(
        params: TokenDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenDeleteResponse>

    /** Get the personal access token with the given ID. */
    @JvmOverloads
    fun get(
        params: TokenGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenGetResponse>

    /** A view of [TokenServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /token`, but is otherwise the same as
         * [TokenServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: TokenCreateParams = TokenCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenCreateResponse>>

        /**
         * Returns a raw HTTP response for `post /token`, but is otherwise the same as
         * [TokenServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TokenCreateResponse>> =
            create(TokenCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /token`, but is otherwise the same as
         * [TokenServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: TokenListParams = TokenListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenListResponse>>

        /**
         * Returns a raw HTTP response for `get /token`, but is otherwise the same as
         * [TokenServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TokenListResponse>> =
            list(TokenListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /token/{id}`, but is otherwise the same as
         * [TokenServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: TokenDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenDeleteResponse>>

        /**
         * Returns a raw HTTP response for `get /token/{id}`, but is otherwise the same as
         * [TokenServiceAsync.get].
         */
        @JvmOverloads
        @MustBeClosed
        fun get(
            params: TokenGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenGetResponse>>
    }
}
