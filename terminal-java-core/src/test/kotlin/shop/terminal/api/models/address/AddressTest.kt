// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.address

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressTest {

    @Test
    fun create() {
        val address =
            Address.builder()
                .id("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .city("Anytown")
                .country("US")
                .name("John Doe")
                .street1("123 Main St")
                .zip("12345")
                .phone("5555555555")
                .province("CA")
                .street2("Apt 1")
                .build()

        assertThat(address.id()).isEqualTo("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(address.city()).isEqualTo("Anytown")
        assertThat(address.country()).isEqualTo("US")
        assertThat(address.name()).isEqualTo("John Doe")
        assertThat(address.street1()).isEqualTo("123 Main St")
        assertThat(address.zip()).isEqualTo("12345")
        assertThat(address.phone()).contains("5555555555")
        assertThat(address.province()).contains("CA")
        assertThat(address.street2()).contains("Apt 1")
    }
}
