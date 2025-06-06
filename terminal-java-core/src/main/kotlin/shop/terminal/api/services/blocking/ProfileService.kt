// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.profile.ProfileMeParams
import shop.terminal.api.models.profile.ProfileMeResponse
import shop.terminal.api.models.profile.ProfileUpdateParams
import shop.terminal.api.models.profile.ProfileUpdateResponse

interface ProfileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Update the current user's profile. */
    fun update(params: ProfileUpdateParams): ProfileUpdateResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileUpdateResponse

    /** Get the current user's profile. */
    fun me(): ProfileMeResponse = me(ProfileMeParams.none())

    /** @see [me] */
    fun me(
        params: ProfileMeParams = ProfileMeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileMeResponse

    /** @see [me] */
    fun me(params: ProfileMeParams = ProfileMeParams.none()): ProfileMeResponse =
        me(params, RequestOptions.none())

    /** @see [me] */
    fun me(requestOptions: RequestOptions): ProfileMeResponse =
        me(ProfileMeParams.none(), requestOptions)

    /** A view of [ProfileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `put /profile`, but is otherwise the same as
         * [ProfileService.update].
         */
        @MustBeClosed
        fun update(params: ProfileUpdateParams): HttpResponseFor<ProfileUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /profile`, but is otherwise the same as
         * [ProfileService.me].
         */
        @MustBeClosed fun me(): HttpResponseFor<ProfileMeResponse> = me(ProfileMeParams.none())

        /** @see [me] */
        @MustBeClosed
        fun me(
            params: ProfileMeParams = ProfileMeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileMeResponse>

        /** @see [me] */
        @MustBeClosed
        fun me(
            params: ProfileMeParams = ProfileMeParams.none()
        ): HttpResponseFor<ProfileMeResponse> = me(params, RequestOptions.none())

        /** @see [me] */
        @MustBeClosed
        fun me(requestOptions: RequestOptions): HttpResponseFor<ProfileMeResponse> =
            me(ProfileMeParams.none(), requestOptions)
    }
}
