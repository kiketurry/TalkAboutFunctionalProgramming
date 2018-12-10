package parcialcurrying

fun consoleLoggerCurrying(type: String) : (String) -> Unit = {msg ->
    println("[$type] -> $msg")
}

fun operationCurrying(a: Int, b: Int, logger: (String) -> Unit) {
    if (a <= 0) {
        logger("a must be positive")
        return
    }

    if (b <= 0) {
        logger("b must be positive")
        return
    }
}

fun main(args: Array<String>){
    operationCurrying(1, -2, consoleLoggerCurrying("ERROR"))
}