@file:JvmName("PrepareRequest")

package shop.terminal.api.core

import java.util.concurrent.CompletableFuture
import shop.terminal.api.core.http.HttpRequest

@JvmSynthetic
internal fun HttpRequest.prepare(clientOptions: ClientOptions, params: Params): HttpRequest =
    toBuilder()
        .putAllQueryParams(clientOptions.queryParams)
        .replaceAllQueryParams(params._queryParams())
        .putAllHeaders(clientOptions.headers)
        .replaceAllHeaders(params._headers())
        .build()

@JvmSynthetic
internal fun HttpRequest.prepareAsync(
    clientOptions: ClientOptions,
    params: Params,
): CompletableFuture<HttpRequest> =
    // This async version exists to make it easier to add async specific preparation logic in the
    // future.
    CompletableFuture.completedFuture(prepare(clientOptions, params))
