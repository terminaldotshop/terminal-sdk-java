// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
    @JvmOverloads
    fun update(
        params: ProfileUpdateParams = ProfileUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileUpdateResponse>

    /** Update the current user's profile. */
    fun update(requestOptions: RequestOptions): CompletableFuture<ProfileUpdateResponse> =
        update(ProfileUpdateParams.none(), requestOptions)

    /** Get the current user's profile. */
    @JvmOverloads
    fun me(
        params: ProfileMeParams = ProfileMeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileMeResponse>

    /** Get the current user's profile. */
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
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: ProfileUpdateParams = ProfileUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileUpdateResponse>>

        /**
         * Returns a raw HTTP response for `put /profile`, but is otherwise the same as
         * [ProfileServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProfileUpdateResponse>> =
            update(ProfileUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /profile`, but is otherwise the same as
         * [ProfileServiceAsync.me].
         */
        @JvmOverloads
        @MustBeClosed
        fun me(
            params: ProfileMeParams = ProfileMeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileMeResponse>>

        /**
         * Returns a raw HTTP response for `get /profile`, but is otherwise the same as
         * [ProfileServiceAsync.me].
         */
        @MustBeClosed
        fun me(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProfileMeResponse>> =
            me(ProfileMeParams.none(), requestOptions)
    }
}
