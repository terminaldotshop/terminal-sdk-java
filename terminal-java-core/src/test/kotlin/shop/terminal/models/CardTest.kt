// File generated from our OpenAPI spec by Stainless.

package shop.terminal.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardTest {

    @Test
    fun createCard() {
        val card =
            Card.builder()
                .id("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .brand("Visa")
                .expiration(Card.Expiration.builder().month(12L).year(2023L).build())
                .last4("1234")
                .build()
        assertThat(card).isNotNull
        assertThat(card.id()).isEqualTo("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(card.brand()).isEqualTo("Visa")
        assertThat(card.expiration())
            .isEqualTo(Card.Expiration.builder().month(12L).year(2023L).build())
        assertThat(card.last4()).isEqualTo("1234")
    }
}