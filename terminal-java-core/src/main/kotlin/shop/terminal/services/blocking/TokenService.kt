// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.services.blocking

import shop.terminal.core.RequestOptions
import shop.terminal.models.TokenCreateParams
import shop.terminal.models.TokenCreateResponse
import shop.terminal.models.TokenDeleteParams
import shop.terminal.models.TokenDeleteResponse
import shop.terminal.models.TokenGetParams
import shop.terminal.models.TokenGetResponse
import shop.terminal.models.TokenListParams
import shop.terminal.models.TokenListResponse

interface TokenService {

    /** Create a personal access token. */
    @JvmOverloads
    fun create(
        params: TokenCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TokenCreateResponse

    /** List the current user's personal access tokens. */
    @JvmOverloads
    fun list(
        params: TokenListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TokenListResponse

    /** Delete the personal access token with the given ID. */
    @JvmOverloads
    fun delete(
        params: TokenDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TokenDeleteResponse

    /** Get the personal token with the given ID. */
    @JvmOverloads
    fun get(
        params: TokenGetParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TokenGetResponse
}
