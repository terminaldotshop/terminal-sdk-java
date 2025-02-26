// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.api.services.async

import java.util.concurrent.CompletableFuture
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.models.TokenCreateParams
import shop.terminal.api.models.TokenCreateResponse
import shop.terminal.api.models.TokenDeleteParams
import shop.terminal.api.models.TokenDeleteResponse
import shop.terminal.api.models.TokenGetParams
import shop.terminal.api.models.TokenGetResponse
import shop.terminal.api.models.TokenListParams
import shop.terminal.api.models.TokenListResponse

interface TokenServiceAsync {

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
}
