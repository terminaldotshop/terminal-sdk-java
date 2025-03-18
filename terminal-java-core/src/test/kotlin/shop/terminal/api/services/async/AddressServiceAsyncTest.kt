// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClientAsync
import shop.terminal.api.models.address.AddressCreateParams
import shop.terminal.api.models.address.AddressDeleteParams
import shop.terminal.api.models.address.AddressGetParams

@ExtendWith(TestServerExtension::class)
internal class AddressServiceAsyncTest {

    @Test
    fun create() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val addressServiceAsync = client.address()

        val addressFuture =
            addressServiceAsync.create(
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
            )

        val address = addressFuture.get()
        address.validate()
    }

    @Test
    fun list() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val addressServiceAsync = client.address()

        val addressFuture = addressServiceAsync.list()

        val address = addressFuture.get()
        address.validate()
    }

    @Test
    fun delete() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val addressServiceAsync = client.address()

        val addressFuture =
            addressServiceAsync.delete(
                AddressDeleteParams.builder().id("shp_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )

        val address = addressFuture.get()
        address.validate()
    }

    @Test
    fun get() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val addressServiceAsync = client.address()

        val addressFuture =
            addressServiceAsync.get(
                AddressGetParams.builder().id("shp_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )

        val address = addressFuture.get()
        address.validate()
    }
}
