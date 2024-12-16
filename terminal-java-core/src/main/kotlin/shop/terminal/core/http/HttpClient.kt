@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package shop.terminal.core.http

import java.lang.AutoCloseable
import java.util.concurrent.CompletableFuture
import shop.terminal.core.RequestOptions

interface HttpClient : AutoCloseable {

    @JvmOverloads
    fun execute(
        request: HttpRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    @JvmOverloads
    fun executeAsync(
        request: HttpRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>
}
