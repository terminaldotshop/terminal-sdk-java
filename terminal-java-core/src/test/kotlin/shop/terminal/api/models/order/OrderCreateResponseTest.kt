// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.order

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderCreateResponseTest {

    @Test
    fun create() {
        val orderCreateResponse =
            OrderCreateResponse.builder().data("ord_XXXXXXXXXXXXXXXXXXXXXXXXX").build()

        assertThat(orderCreateResponse.data()).isEqualTo("ord_XXXXXXXXXXXXXXXXXXXXXXXXX")
    }
}
