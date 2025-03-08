// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.ProfileMeParams
import shop.terminal.api.models.ProfileMeResponse
import shop.terminal.api.models.ProfileUpdateParams
import shop.terminal.api.models.ProfileUpdateResponse

interface ProfileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Update the current user's profile. */
    fun update(params: ProfileUpdateParams): CompletableFuture<ProfileUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileUpdateResponse>

    /** Get the current user's profile. */
    fun me(): CompletableFuture<ProfileMeResponse> = me(ProfileMeParams.none())

    /** @see [me] */
    fun me(
        params: ProfileMeParams = ProfileMeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileMeResponse>

    /** @see [me] */
    fun me(params: ProfileMeParams = ProfileMeParams.none()): CompletableFuture<ProfileMeResponse> =
        me(params, RequestOptions.none())

    /** @see [me] */
    fun me(requestOptions: RequestOptions): CompletableFuture<ProfileMeResponse> =
        me(ProfileMeParams.none(), requestOptions)

    /**
     * A view of [ProfileServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `put /profile`, but is otherwise the same as
         * [ProfileServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: ProfileUpdateParams
        ): CompletableFuture<HttpResponseFor<ProfileUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /profile`, but is otherwise the same as
         * [ProfileServiceAsync.me].
         */
        @MustBeClosed
        fun me(): CompletableFuture<HttpResponseFor<ProfileMeResponse>> = me(ProfileMeParams.none())

        /** @see [me] */
        @MustBeClosed
        fun me(
            params: ProfileMeParams = ProfileMeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileMeResponse>>

        /** @see [me] */
        @MustBeClosed
        fun me(
            params: ProfileMeParams = ProfileMeParams.none()
        ): CompletableFuture<HttpResponseFor<ProfileMeResponse>> = me(params, RequestOptions.none())

        /** @see [me] */
        @MustBeClosed
        fun me(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProfileMeResponse>> =
            me(ProfileMeParams.none(), requestOptions)
    }
}
