// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClientAsync

@ExtendWith(TestServerExtension::class)
internal class ViewServiceAsyncTest {

    @Test
    fun init() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val viewServiceAsync = client.view()

        val responseFuture = viewServiceAsync.init()

        val response = responseFuture.get()
        response.validate()
    }
}
