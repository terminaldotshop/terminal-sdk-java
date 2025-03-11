// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClientAsync
import shop.terminal.api.models.profile.ProfileUpdateParams

@ExtendWith(TestServerExtension::class)
class ProfileServiceAsyncTest {

    @Test
    fun update() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val profileServiceAsync = client.profile()

        val profileFuture =
            profileServiceAsync.update(
                ProfileUpdateParams.builder().email("john@example.com").name("John Doe").build()
            )

        val profile = profileFuture.get()
        profile.validate()
    }

    @Test
    fun me() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val profileServiceAsync = client.profile()

        val responseFuture = profileServiceAsync.me()

        val response = responseFuture.get()
        response.validate()
    }
}
