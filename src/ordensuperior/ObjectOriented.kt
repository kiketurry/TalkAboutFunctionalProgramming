package ordensuperior
fun main(args: Array<String>) {
    getValueObject(5, ConsoleLogger())
}

fun getValueObject(number: Int, logger: LoggerObject): String {
    val result = "Something $number"

    logger.print(result)

    return result
}

interface LoggerObject {
    fun print(msg: String)
}

class ConsoleLogger : LoggerObject {
    override fun print(msg: String) {
        logToConsoleObject(msg)
    }
}

class FileLogger : LoggerObject {
    override fun print(msg: String) {
        logToFile(msg)
    }
}

class WindowLogger : LoggerObject {
    override fun print(msg: String) {
        logToWindow(msg)
    }
}

//(String) -> Unit
fun logObject(msg: String) {
    println(msg)
}

fun logToConsoleObject(msg: String) {
    println(msg)
}

fun logToFileObject(msg: String) {
    println(msg)
}

fun logToWindowObject(msg: String) {
    println(msg)
}