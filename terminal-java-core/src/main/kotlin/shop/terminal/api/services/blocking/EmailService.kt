// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.EmailCreateParams
import shop.terminal.api.models.EmailCreateResponse

interface EmailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Subscribe to email updates from Terminal. */
    @JvmOverloads
    fun create(
        params: EmailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailCreateResponse

    /** A view of [EmailService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /email`, but is otherwise the same as
         * [EmailService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: EmailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailCreateResponse>
    }
}
