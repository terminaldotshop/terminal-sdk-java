// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AddressCreateParamsTest {

    @Test
    fun createAddressCreateParams() {
        AddressCreateParams.builder()
            .city("Anytown")
            .country("US")
            .name("John Doe")
            .street1("123 Main St")
            .zip("12345")
            .phone("5555555555")
            .province("CA")
            .street2("Apt 1")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AddressCreateParams.builder()
                .city("Anytown")
                .country("US")
                .name("John Doe")
                .street1("123 Main St")
                .zip("12345")
                .phone("5555555555")
                .province("CA")
                .street2("Apt 1")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.city()).isEqualTo("Anytown")
        assertThat(body.country()).isEqualTo("US")
        assertThat(body.name()).isEqualTo("John Doe")
        assertThat(body.street1()).isEqualTo("123 Main St")
        assertThat(body.zip()).isEqualTo("12345")
        assertThat(body.phone()).isEqualTo("5555555555")
        assertThat(body.province()).isEqualTo("CA")
        assertThat(body.street2()).isEqualTo("Apt 1")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AddressCreateParams.builder()
                .city("Anytown")
                .country("US")
                .name("John Doe")
                .street1("123 Main St")
                .zip("12345")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.city()).isEqualTo("Anytown")
        assertThat(body.country()).isEqualTo("US")
        assertThat(body.name()).isEqualTo("John Doe")
        assertThat(body.street1()).isEqualTo("123 Main St")
        assertThat(body.zip()).isEqualTo("12345")
    }
}
