// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClientAsync
import shop.terminal.api.models.cart.CartSetAddressParams
import shop.terminal.api.models.cart.CartSetCardParams
import shop.terminal.api.models.cart.CartSetItemParams

@ExtendWith(TestServerExtension::class)
class CartServiceAsyncTest {

    @Test
    fun convert() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cartServiceAsync = client.cart()

        val responseFuture = cartServiceAsync.convert()

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun get() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cartServiceAsync = client.cart()

        val cartFuture = cartServiceAsync.get()

        val cart = cartFuture.get()
        cart.validate()
    }

    @Test
    fun setAddress() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cartServiceAsync = client.cart()

        val responseFuture =
            cartServiceAsync.setAddress(
                CartSetAddressParams.builder().addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun setCard() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cartServiceAsync = client.cart()

        val responseFuture =
            cartServiceAsync.setCard(
                CartSetCardParams.builder().cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun setItem() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cartServiceAsync = client.cart()

        val responseFuture =
            cartServiceAsync.setItem(
                CartSetItemParams.builder()
                    .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .quantity(2L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
