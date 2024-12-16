// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.services.blocking

import shop.terminal.core.RequestOptions
import shop.terminal.models.UserInitParams
import shop.terminal.models.UserInitResponse
import shop.terminal.models.UserMeParams
import shop.terminal.models.UserMeResponse
import shop.terminal.models.UserUpdateParams
import shop.terminal.models.UserUpdateResponse

interface UserService {

    /** Update the current user. */
    @JvmOverloads
    fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): UserUpdateResponse

    /**
     * Get initial app data, including user, products, cart, addresses, cards, subscriptions, and
     * orders.
     */
    @JvmOverloads
    fun init(
        params: UserInitParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): UserInitResponse

    /** Get the current user. */
    @JvmOverloads
    fun me(
        params: UserMeParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): UserMeResponse
}
