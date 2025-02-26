// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.api.services.async

import java.util.concurrent.CompletableFuture
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.models.ProfileMeParams
import shop.terminal.api.models.ProfileMeResponse
import shop.terminal.api.models.ProfileUpdateParams
import shop.terminal.api.models.ProfileUpdateResponse

interface ProfileServiceAsync {

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
}
