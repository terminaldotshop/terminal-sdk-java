// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AppCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body().getOrNull()

        assertThat(body)
            .isEqualTo(
                App.builder()
                    .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .name("Example App")
                    .redirectUri("https://example.com/callback")
                    .secret("sec_******XXXX")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AppCreateParams.builder().build()

        val body = params._body().getOrNull()
    }
}
