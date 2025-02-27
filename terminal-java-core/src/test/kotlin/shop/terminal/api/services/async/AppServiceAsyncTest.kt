// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClientAsync
import shop.terminal.api.models.App
import shop.terminal.api.models.AppCreateParams
import shop.terminal.api.models.AppDeleteParams
import shop.terminal.api.models.AppGetParams

@ExtendWith(TestServerExtension::class)
class AppServiceAsyncTest {

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
                    .app(
                        App.builder()
                            .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                            .name("Example App")
                            .redirectUri("https://example.com/callback")
                            .secret("sec_******XXXX")
                            .build()
                    )
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

        val appFuture = appServiceAsync.list()

        val app = appFuture.get()
        app.validate()
    }

    @Test
    fun delete() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val appServiceAsync = client.app()

        val appFuture =
            appServiceAsync.delete(
                AppDeleteParams.builder().id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )

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

        val appFuture =
            appServiceAsync.get(AppGetParams.builder().id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX").build())

        val app = appFuture.get()
        app.validate()
    }
}
