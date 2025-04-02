// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClientAsync
import shop.terminal.api.models.subscription.Subscription
import shop.terminal.api.models.subscription.SubscriptionCreateParams
import shop.terminal.api.models.subscription.SubscriptionDeleteParams
import shop.terminal.api.models.subscription.SubscriptionGetParams

@ExtendWith(TestServerExtension::class)
internal class SubscriptionServiceAsyncTest {

    @Test
    fun create() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionServiceAsync = client.subscription()

        val subscriptionFuture =
            subscriptionServiceAsync.create(
                SubscriptionCreateParams.builder()
                    .subscription(
                        Subscription.builder()
                            .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                            .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                            .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                            .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                            .quantity(1L)
                            .next("2025-02-01T19:36:19.000Z")
                            .schedule(
                                Subscription.Schedule.Weekly.builder()
                                    .interval(3L)
                                    .type(Subscription.Schedule.Weekly.Type.WEEKLY)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val subscription = subscriptionFuture.get()
        subscription.validate()
    }

    @Test
    fun list() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionServiceAsync = client.subscription()

        val subscriptionsFuture = subscriptionServiceAsync.list()

        val subscriptions = subscriptionsFuture.get()
        subscriptions.validate()
    }

    @Test
    fun delete() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionServiceAsync = client.subscription()

        val subscriptionFuture =
            subscriptionServiceAsync.delete(
                SubscriptionDeleteParams.builder().id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )

        val subscription = subscriptionFuture.get()
        subscription.validate()
    }

    @Test
    fun get() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionServiceAsync = client.subscription()

        val subscriptionFuture =
            subscriptionServiceAsync.get(
                SubscriptionGetParams.builder().id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )

        val subscription = subscriptionFuture.get()
        subscription.validate()
    }
}
