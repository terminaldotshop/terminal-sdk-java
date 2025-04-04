// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.cart

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CartSetAddressResponseTest {

    @Test
    fun create() {
        val cartSetAddressResponse =
            CartSetAddressResponse.builder().data(CartSetAddressResponse.Data.OK).build()

        assertThat(cartSetAddressResponse.data()).isEqualTo(CartSetAddressResponse.Data.OK)
    }
}
