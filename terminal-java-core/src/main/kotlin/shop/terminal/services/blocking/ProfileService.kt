// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.services.blocking

import shop.terminal.core.RequestOptions
import shop.terminal.models.ProfileMeParams
import shop.terminal.models.ProfileMeResponse
import shop.terminal.models.ProfileUpdateParams
import shop.terminal.models.ProfileUpdateResponse

interface ProfileService {

    /** Update the current user's profile. */
    @JvmOverloads
    fun update(
        params: ProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ProfileUpdateResponse

    /** Get the current user's profile. */
    @JvmOverloads
    fun me(
        params: ProfileMeParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ProfileMeResponse
}
