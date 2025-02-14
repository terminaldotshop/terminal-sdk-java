// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionCreateParamsTest {

    @Test
    fun create() {
        SubscriptionCreateParams.builder()
            .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
            .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
            .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
            .frequency(SubscriptionCreateParams.Frequency.FIXED)
            .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
            .quantity(1L)
            .next("2025-02-01T19:36:19.000Z")
            .build()
    }

    @Test
    fun body() {
        val params =
            SubscriptionCreateParams.builder()
                .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .frequency(SubscriptionCreateParams.Frequency.FIXED)
                .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .quantity(1L)
                .next("2025-02-01T19:36:19.000Z")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.addressId()).isEqualTo("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.cardId()).isEqualTo("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.frequency()).isEqualTo(SubscriptionCreateParams.Frequency.FIXED)
        assertThat(body.productVariantId()).isEqualTo("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.quantity()).isEqualTo(1L)
        assertThat(body.next()).contains("2025-02-01T19:36:19.000Z")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionCreateParams.builder()
                .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .frequency(SubscriptionCreateParams.Frequency.FIXED)
                .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .quantity(1L)
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.addressId()).isEqualTo("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.cardId()).isEqualTo("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.frequency()).isEqualTo(SubscriptionCreateParams.Frequency.FIXED)
        assertThat(body.productVariantId()).isEqualTo("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.quantity()).isEqualTo(1L)
    }
}
