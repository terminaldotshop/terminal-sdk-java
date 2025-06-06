// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.card

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class CardTest {

    @Test
    fun create() {
        val card =
            Card.builder()
                .id("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .brand("Visa")
                .created("2024-06-29T19:36:19.000Z")
                .expiration(Card.Expiration.builder().month(12L).year(2023L).build())
                .last4("1234")
                .build()

        assertThat(card.id()).isEqualTo("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(card.brand()).isEqualTo("Visa")
        assertThat(card.created()).isEqualTo("2024-06-29T19:36:19.000Z")
        assertThat(card.expiration())
            .isEqualTo(Card.Expiration.builder().month(12L).year(2023L).build())
        assertThat(card.last4()).isEqualTo("1234")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val card =
            Card.builder()
                .id("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .brand("Visa")
                .created("2024-06-29T19:36:19.000Z")
                .expiration(Card.Expiration.builder().month(12L).year(2023L).build())
                .last4("1234")
                .build()

        val roundtrippedCard =
            jsonMapper.readValue(jsonMapper.writeValueAsString(card), jacksonTypeRef<Card>())

        assertThat(roundtrippedCard).isEqualTo(card)
    }
}
