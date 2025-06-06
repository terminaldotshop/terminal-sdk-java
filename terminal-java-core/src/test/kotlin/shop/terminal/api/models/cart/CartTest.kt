// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.cart

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class CartTest {

    @Test
    fun create() {
        val cart =
            Cart.builder()
                .amount(Cart.Amount.builder().subtotal(4400L).shipping(800L).total(0L).build())
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

        assertThat(cart.amount())
            .isEqualTo(Cart.Amount.builder().subtotal(4400L).shipping(800L).total(0L).build())
        assertThat(cart.items())
            .containsExactly(
                Cart.Item.builder()
                    .id("itm_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .quantity(2L)
                    .subtotal(4400L)
                    .build()
            )
        assertThat(cart.subtotal()).isEqualTo(4400L)
        assertThat(cart.addressId()).contains("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(cart.cardId()).contains("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(cart.shipping())
            .contains(
                Cart.Shipping.builder()
                    .service("USPS Ground Advantage")
                    .timeframe("3-5 days")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cart =
            Cart.builder()
                .amount(Cart.Amount.builder().subtotal(4400L).shipping(800L).total(0L).build())
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

        val roundtrippedCart =
            jsonMapper.readValue(jsonMapper.writeValueAsString(cart), jacksonTypeRef<Cart>())

        assertThat(roundtrippedCart).isEqualTo(cart)
    }
}
