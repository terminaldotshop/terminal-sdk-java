// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CartSetCardResponseTest {

    @Test
    fun createCartSetCardResponse() {
        val cartSetCardResponse =
            CartSetCardResponse.builder().data(CartSetCardResponse.Data.OK).build()
        assertThat(cartSetCardResponse).isNotNull
        assertThat(cartSetCardResponse.data()).isEqualTo(CartSetCardResponse.Data.OK)
    }
}
