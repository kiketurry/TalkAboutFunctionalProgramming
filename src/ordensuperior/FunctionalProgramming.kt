package ordensuperior

import ordensuperior.Logger.*

fun main(args: Array<String>) {
    getValue(5, CONSOLE)
}

fun getValue(number: Int, logger: Logger): String {
    val result = "Something $number"

    logger.print(result)

    return result
}

enum class Logger {
    CONSOLE, WINDOWS, FILE;

    val print: (String) -> Unit get() = when(this) {
        CONSOLE -> ::logToConsole
        WINDOWS -> ::logToWindow
        FILE -> ::logToFile
    }
}

fun logToConsole(msg: String) {
    println(msg)
}

fun logToFile(msg: String) {
    println(msg)
}

fun logToWindow(msg: String) {
    println(msg)
}