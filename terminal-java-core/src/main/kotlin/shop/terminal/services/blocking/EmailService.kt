// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.services.blocking

import shop.terminal.core.RequestOptions
import shop.terminal.models.EmailCreateParams
import shop.terminal.models.EmailCreateResponse

interface EmailService {

    /** Subscribe to email updates from Terminal. */
    @JvmOverloads
    fun create(
        params: EmailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EmailCreateResponse
}
