// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClientAsync
import shop.terminal.api.models.TokenDeleteParams
import shop.terminal.api.models.TokenGetParams

@ExtendWith(TestServerExtension::class)
class TokenServiceAsyncTest {

    @Test
    fun create() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val tokenServiceAsync = client.token()

        val tokenFuture = tokenServiceAsync.create()

        val token = tokenFuture.get()
        token.validate()
    }

    @Test
    fun list() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val tokenServiceAsync = client.token()

        val tokenFuture = tokenServiceAsync.list()

        val token = tokenFuture.get()
        token.validate()
    }

    @Test
    fun delete() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val tokenServiceAsync = client.token()

        val tokenFuture =
            tokenServiceAsync.delete(
                TokenDeleteParams.builder().id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )

        val token = tokenFuture.get()
        token.validate()
    }

    @Test
    fun get() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val tokenServiceAsync = client.token()

        val tokenFuture =
            tokenServiceAsync.get(
                TokenGetParams.builder().id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )

        val token = tokenFuture.get()
        token.validate()
    }
}
