package recursion

//Acumulator Passing Style, fusionar la parte de contracción con la de expansión
//Tail Call Optimization, tail recursion

sealed class ListAPS<T> {
    class Empty<T> : ListAPS<T>()
    class NonEmpty<T>(val head: T, val tail: ListAPS<T>) : ListAPS<T>()
}

fun main(args: Array<String>) {
    val cart = ListAPS.NonEmpty(
        120, ListAPS.NonEmpty(
            40, ListAPS.NonEmpty(
                30, ListAPS.NonEmpty(
                    55, ListAPS.NonEmpty(
                        12, ListAPS.NonEmpty(
                            3, ListAPS.NonEmpty(
                                10, ListAPS.Empty()
                            )
                        )
                    )
                )
            )
        )
    )

    println(totalCostAPS(cart))
}

tailrec fun totalCostAPS(items: ListAPS<Int>, accumulator: Int = 0): Int =
    when (items) {
        is ListAPS.Empty -> accumulator
        is ListAPS.NonEmpty -> totalCostAPS(items.tail, items.head + accumulator)
    }