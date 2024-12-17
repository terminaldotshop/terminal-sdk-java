// File generated from our OpenAPI spec by Stainless.

package shop.terminal.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AppCreateResponseTest {

    @Test
    fun createAppCreateResponse() {
        val appCreateResponse =
            AppCreateResponse.builder()
                .data(
                    AppCreateResponse.Data.builder()
                        .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .secret("sec_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .build()
                )
                .build()
        assertThat(appCreateResponse).isNotNull
        assertThat(appCreateResponse.data())
            .isEqualTo(
                AppCreateResponse.Data.builder()
                    .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .secret("sec_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .build()
            )
    }
}
