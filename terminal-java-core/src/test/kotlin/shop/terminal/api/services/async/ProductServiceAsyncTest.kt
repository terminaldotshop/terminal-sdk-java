// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClientAsync
import shop.terminal.api.models.product.ProductGetParams

@ExtendWith(TestServerExtension::class)
class ProductServiceAsyncTest {

    @Test
    fun list() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productServiceAsync = client.product()

        val productFuture = productServiceAsync.list()

        val product = productFuture.get()
        product.validate()
    }

    @Test
    fun get() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productServiceAsync = client.product()

        val productFuture =
            productServiceAsync.get(
                ProductGetParams.builder().id("prd_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )

        val product = productFuture.get()
        product.validate()
    }
}
