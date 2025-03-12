// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClientAsync
import shop.terminal.api.models.email.EmailCreateParams

@ExtendWith(TestServerExtension::class)
class EmailServiceAsyncTest {

    @Test
    fun create() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val emailServiceAsync = client.email()

        val emailFuture =
            emailServiceAsync.create(EmailCreateParams.builder().email("john@example.com").build())

        val email = emailFuture.get()
        email.validate()
    }
}
