// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CartSetItemResponseTest {

    @Test
    fun createCartSetItemResponse() {
        val cartSetItemResponse =
            CartSetItemResponse.builder()
                .data(
                    Cart.builder()
                        .amount(Cart.Amount.builder().subtotal(4400L).shipping(800L).build())
                        .addItem(
                            Cart.Item.builder()
                                .id("itm_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .quantity(2L)
                                .subtotal(4400L)
                                .build()
                        )
                        .subtotal(4400L)
                        .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .shipping(
                            Cart.Shipping.builder()
                                .service("USPS Ground Advantage")
                                .timeframe("3-5 days")
                                .build()
                        )
                        .build()
                )
                .build()
        assertThat(cartSetItemResponse).isNotNull
        assertThat(cartSetItemResponse.data())
            .isEqualTo(
                Cart.builder()
                    .amount(Cart.Amount.builder().subtotal(4400L).shipping(800L).build())
                    .addItem(
                        Cart.Item.builder()
                            .id("itm_XXXXXXXXXXXXXXXXXXXXXXXXX")
                            .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                            .quantity(2L)
                            .subtotal(4400L)
                            .build()
                    )
                    .subtotal(4400L)
                    .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .shipping(
                        Cart.Shipping.builder()
                            .service("USPS Ground Advantage")
                            .timeframe("3-5 days")
                            .build()
                    )
                    .build()
            )
    }
}