package shop.terminal.api.errors

import shop.terminal.api.core.http.Headers

abstract class TerminalServiceException
@JvmOverloads
constructor(
    private val statusCode: Int,
    private val headers: Headers,
    private val body: String,
    private val error: TerminalError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null,
) : TerminalException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): Headers = headers

    fun body(): String = body

    fun error(): TerminalError = error
}
