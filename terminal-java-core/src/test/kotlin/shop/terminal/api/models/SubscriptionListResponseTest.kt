// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionListResponseTest {

    @Test
    fun createSubscriptionListResponse() {
        val subscriptionListResponse =
            SubscriptionListResponse.builder()
                .addData(
                    Subscription.builder()
                        .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .frequency(Subscription.Frequency.FIXED)
                        .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .quantity(1L)
                        .build()
                )
                .build()
        assertThat(subscriptionListResponse).isNotNull
        assertThat(subscriptionListResponse.data())
            .containsExactly(
                Subscription.builder()
                    .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .frequency(Subscription.Frequency.FIXED)
                    .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .quantity(1L)
                    .build()
            )
    }
}
