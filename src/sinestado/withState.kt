package sinestado

fun main(args: Array<String>) {
    storeActiveUserNamesWithState()
    print(activeUserNameWithState)
}

data class UserWithState(val id: Int, val name: String, val active: Boolean)

fun storeActiveUserNamesWithState() {
    //***Mutable
    var activesUsersWithState = mutableListOf<UserWithState>()

    for (user in usersWithState) {
        if (user.active) {
            activesUsersWithState.add(user)
        }
    }

    activesUsersWithState.sortBy { user -> user.id }

    activeUserNameWithState.clear()

    for (user in activesUsersWithState) {
        activeUserNameWithState.add(user.name)
    }
}

//***Mutable
var activeUserNameWithState = mutableListOf<String>()

val usersWithState = listOf(
    UserWithState(1, "One", false),
    UserWithState(2, "Two", true),
    UserWithState(3, "Three", false),
    UserWithState(4, "Four", false),
    UserWithState(5, "Five", true),
    UserWithState(6, "Six", true),
    UserWithState(7, "Seven", false),
    UserWithState(8, "Eight", false),
    UserWithState(9, "Nine", false),
    UserWithState(10, "Ten", true)
)