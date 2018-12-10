package recursion

sealed class List<T> {
    class Empty<T> : List<T>()
    class NonEmpty<T>(val head: T, val tail: List<T>) : List<T>()
}

sealed class FileSystemElement {
    class File : FileSystemElement()
    class Directory(val elements: List<FileSystemElement>) : FileSystemElement()
}

fun main(args: Array<String>) {
    val cart = List.NonEmpty(
        120, List.NonEmpty(
            40, List.NonEmpty(
                30, List.NonEmpty(
                    55, List.NonEmpty(
                        12, List.NonEmpty(
                            3, List.NonEmpty(
                                10, List.Empty()
                            )
                        )
                    )
                )
            )
        )
    )

    println(totalCostAPS(cart))
}

fun totalCostAPS(items: List<Int>): Int =
    when (items) {
        is List.Empty -> 0
        is List.NonEmpty -> items.head + totalCostAPS(items.tail)
    }