// File generated from our OpenAPI spec by Stainless.

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
    fun create(params: EmailCreateParams): EmailCreateResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
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
        @MustBeClosed
        fun create(params: EmailCreateParams): HttpResponseFor<EmailCreateResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: EmailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailCreateResponse>
    }
}
