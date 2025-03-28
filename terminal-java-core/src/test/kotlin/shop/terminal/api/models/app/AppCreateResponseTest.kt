// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.app

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AppCreateResponseTest {

    @Test
    fun create() {
        val appCreateResponse =
            AppCreateResponse.builder()
                .data(
                    AppCreateResponse.Data.builder()
                        .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .secret("sec_******XXXX")
                        .build()
                )
                .build()

        assertThat(appCreateResponse.data())
            .isEqualTo(
                AppCreateResponse.Data.builder()
                    .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .secret("sec_******XXXX")
                    .build()
            )
    }
}
