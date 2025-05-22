// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClientAsync
import shop.terminal.api.models.app.AppCreateParams

@ExtendWith(TestServerExtension::class)
internal class AppServiceAsyncTest {

    @Test
    fun create() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val appServiceAsync = client.app()

        val appFuture =
            appServiceAsync.create(
                AppCreateParams.builder()
                    .name("Example App")
                    .redirectUri("https://example.com/callback")
                    .build()
            )

        val app = appFuture.get()
        app.validate()
    }

    @Test
    fun list() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val appServiceAsync = client.app()

        val appsFuture = appServiceAsync.list()

        val apps = appsFuture.get()
        apps.validate()
    }

    @Test
    fun delete() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val appServiceAsync = client.app()

        val appFuture = appServiceAsync.delete("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")

        val app = appFuture.get()
        app.validate()
    }

    @Test
    fun get() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val appServiceAsync = client.app()

        val appFuture = appServiceAsync.get("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")

        val app = appFuture.get()
        app.validate()
    }
}
