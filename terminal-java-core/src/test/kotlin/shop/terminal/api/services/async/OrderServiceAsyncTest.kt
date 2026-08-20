// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClientAsync
import shop.terminal.api.core.JsonValue
import shop.terminal.api.models.order.OrderCreateParams

@ExtendWith(TestServerExtension::class)
internal class OrderServiceAsyncTest {

    @Test
    fun create() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val orderServiceAsync = client.order()

        val orderFuture =
            orderServiceAsync.create(
                OrderCreateParams.builder()
                    .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .variants(
                        OrderCreateParams.Variants.builder()
                            .putAdditionalProperty(
                                "var_XXXXXXXXXXXXXXXXXXXXXXXXX",
                                JsonValue.from(1),
                            )
                            .build()
                    )
                    .build()
            )

        val order = orderFuture.get()
        order.validate()
    }

    @Test
    fun list() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val orderServiceAsync = client.order()

        val ordersFuture = orderServiceAsync.list()

        val orders = ordersFuture.get()
        orders.validate()
    }

    @Test
    fun get() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val orderServiceAsync = client.order()

        val orderFuture = orderServiceAsync.get("ord_XXXXXXXXXXXXXXXXXXXXXXXXX")

        val order = orderFuture.get()
        order.validate()
    }
}
