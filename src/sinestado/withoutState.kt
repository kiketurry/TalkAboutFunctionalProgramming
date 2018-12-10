package sinestado

fun main(args: Array<String>) {
    println(activeUserNames(users))
}

data class User(val id: Int, val name: String, val active: Boolean)

fun activeUserNames(users: List<User>): List<String> {
    return users
        .filter { user -> user.active }
        .sortedBy { (id) -> id }
        .map { it.name }
}

val users = listOf(
    User(1, "One", false),
    User(2, "Two", true),
    User(3, "Three", false),
    User(4, "Four", false),
    User(5, "Five", true),
    User(6, "Six", true),
    User(7, "Seven", false),
    User(8, "Eight", false),
    User(9, "Nine", false),
    User(10, "Ten", true)
)