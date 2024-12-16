// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.services.async

import java.util.concurrent.CompletableFuture
import shop.terminal.core.RequestOptions
import shop.terminal.models.ProductListParams
import shop.terminal.models.ProductListResponse

interface ProductServiceAsync {

    /** List all products for sale in the Terminal shop. */
    @JvmOverloads
    fun list(
        params: ProductListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ProductListResponse>
}
