// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClientAsync
import shop.terminal.api.models.cart.CartConvertParams
import shop.terminal.api.models.cart.CartRedeemGiftCardParams
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

        val responseFuture =
            cartServiceAsync.convert(
                CartConvertParams.builder().recipientEmail("dev@stainless.com").build()
            )

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
    fun redeemGiftCard() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cartServiceAsync = client.cart()

        val responseFuture =
            cartServiceAsync.redeemGiftCard(
                CartRedeemGiftCardParams.builder().giftCardId("giftCardID").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun removeGiftCard() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cartServiceAsync = client.cart()

        val responseFuture = cartServiceAsync.removeGiftCard()

        val response = responseFuture.get()
        response.validate()
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
