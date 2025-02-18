// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.api.services.blocking

import shop.terminal.api.core.RequestOptions
import shop.terminal.api.models.ProductListParams
import shop.terminal.api.models.ProductListResponse

interface ProductService {

    /** List all products for sale in the Terminal shop. */
    @JvmOverloads
    fun list(
        params: ProductListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductListResponse
}
