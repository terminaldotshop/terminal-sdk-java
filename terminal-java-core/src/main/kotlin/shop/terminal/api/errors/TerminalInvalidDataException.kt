package shop.terminal.api.errors

class TerminalInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : TerminalException(message, cause)
