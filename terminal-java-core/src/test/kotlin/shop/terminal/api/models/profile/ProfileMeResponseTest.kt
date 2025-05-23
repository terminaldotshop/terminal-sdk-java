// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.profile

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class ProfileMeResponseTest {

    @Test
    fun create() {
        val profileMeResponse =
            ProfileMeResponse.builder()
                .data(
                    Profile.builder()
                        .user(
                            Profile.User.builder()
                                .id("usr_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .email("john@example.com")
                                .fingerprint("183ded44-24d0-480e-9908-c022eff8d111")
                                .name("John Doe")
                                .stripeCustomerId("cus_XXXXXXXXXXXXXXXXX")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(profileMeResponse.data())
            .isEqualTo(
                Profile.builder()
                    .user(
                        Profile.User.builder()
                            .id("usr_XXXXXXXXXXXXXXXXXXXXXXXXX")
                            .email("john@example.com")
                            .fingerprint("183ded44-24d0-480e-9908-c022eff8d111")
                            .name("John Doe")
                            .stripeCustomerId("cus_XXXXXXXXXXXXXXXXX")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val profileMeResponse =
            ProfileMeResponse.builder()
                .data(
                    Profile.builder()
                        .user(
                            Profile.User.builder()
                                .id("usr_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .email("john@example.com")
                                .fingerprint("183ded44-24d0-480e-9908-c022eff8d111")
                                .name("John Doe")
                                .stripeCustomerId("cus_XXXXXXXXXXXXXXXXX")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedProfileMeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(profileMeResponse),
                jacksonTypeRef<ProfileMeResponse>(),
            )

        assertThat(roundtrippedProfileMeResponse).isEqualTo(profileMeResponse)
    }
}
