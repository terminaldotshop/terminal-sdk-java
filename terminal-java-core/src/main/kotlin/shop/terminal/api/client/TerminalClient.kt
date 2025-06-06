// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.client

import shop.terminal.api.services.blocking.AddressService
import shop.terminal.api.services.blocking.AppService
import shop.terminal.api.services.blocking.CardService
import shop.terminal.api.services.blocking.CartService
import shop.terminal.api.services.blocking.EmailService
import shop.terminal.api.services.blocking.OrderService
import shop.terminal.api.services.blocking.ProductService
import shop.terminal.api.services.blocking.ProfileService
import shop.terminal.api.services.blocking.SubscriptionService
import shop.terminal.api.services.blocking.TokenService
import shop.terminal.api.services.blocking.ViewService

/**
 * A client for interacting with the Terminal REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface TerminalClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): TerminalClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun product(): ProductService

    fun profile(): ProfileService

    fun address(): AddressService

    fun card(): CardService

    fun cart(): CartService

    fun order(): OrderService

    fun subscription(): SubscriptionService

    fun token(): TokenService

    fun app(): AppService

    fun email(): EmailService

    fun view(): ViewService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /** A view of [TerminalClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun product(): ProductService.WithRawResponse

        fun profile(): ProfileService.WithRawResponse

        fun address(): AddressService.WithRawResponse

        fun card(): CardService.WithRawResponse

        fun cart(): CartService.WithRawResponse

        fun order(): OrderService.WithRawResponse

        fun subscription(): SubscriptionService.WithRawResponse

        fun token(): TokenService.WithRawResponse

        fun app(): AppService.WithRawResponse

        fun email(): EmailService.WithRawResponse

        fun view(): ViewService.WithRawResponse
    }
}
