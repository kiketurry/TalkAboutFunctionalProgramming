package parcialcurrying

fun consoleLogger(type: String, msg: String) {
    println("[$type] -> $msg")
}

fun operation(a: Int, b: Int, logger: (String, String) -> Unit) {
    if (a <= 0) {
        logger("LOG", "a must be positive")
        return
    }

    if (b <= 0) {
        logger("LOG", "b must be positive")
        return
    }
}

fun main(args: Array<String>){
    operation(-1, 2, ::consoleLogger)
}