// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.api.services.blocking

import shop.terminal.api.core.RequestOptions
import shop.terminal.api.models.AddressCreateParams
import shop.terminal.api.models.AddressCreateResponse
import shop.terminal.api.models.AddressDeleteParams
import shop.terminal.api.models.AddressDeleteResponse
import shop.terminal.api.models.AddressListParams
import shop.terminal.api.models.AddressListResponse

interface AddressService {

    /** Create and add a shipping address to the current user. */
    @JvmOverloads
    fun create(
        params: AddressCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddressCreateResponse

    /** Get the shipping addresses associated with the current user. */
    @JvmOverloads
    fun list(
        params: AddressListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddressListResponse

    /** Delete a shipping address from the current user. */
    @JvmOverloads
    fun delete(
        params: AddressDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddressDeleteResponse
}
