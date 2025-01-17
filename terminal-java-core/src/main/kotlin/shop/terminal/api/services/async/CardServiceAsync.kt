// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.api.services.async

import java.util.concurrent.CompletableFuture
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.models.CardCreateParams
import shop.terminal.api.models.CardCreateResponse
import shop.terminal.api.models.CardDeleteParams
import shop.terminal.api.models.CardDeleteResponse
import shop.terminal.api.models.CardListParams
import shop.terminal.api.models.CardListResponse

interface CardServiceAsync {

    /** Attach a credit card (tokenized via Stripe) to the current user. */
    @JvmOverloads
    fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CardCreateResponse>

    /** List the credit cards associated with the current user. */
    @JvmOverloads
    fun list(
        params: CardListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CardListResponse>

    /** Delete a credit card associated with the current user. */
    @JvmOverloads
    fun delete(
        params: CardDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CardDeleteResponse>
}