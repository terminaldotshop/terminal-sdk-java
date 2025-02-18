// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.api.services.async

import java.util.concurrent.CompletableFuture
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.models.EmailCreateParams
import shop.terminal.api.models.EmailCreateResponse

interface EmailServiceAsync {

    /** Subscribe to email updates from Terminal. */
    @JvmOverloads
    fun create(
        params: EmailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailCreateResponse>
}
