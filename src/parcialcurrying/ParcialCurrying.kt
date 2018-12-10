package parcialcurrying

//class Connector {
//    fun connet(host: String = "localhost", port: Int = 80) {
//
//    }
//
//    fun connet(host: String) {
//        connet(host, 80)
//    }
//
//    fun connet(port: Int) {
//        connet("localhost", port)
//    }
//
//    fun connet() {
//        connet("localhost", 80)
//    }
//
//}

//Funciones currificadas -> La funcion en vez de aceptar x parametros y hacer una operación devuelve otra función que fija uno de los parámetros
// y retorna una función de x -1 parámetros, siguiendo asi hasta la función que realiza la operación deseada.

fun connectParcialCurrying(host: String): (Int) -> Unit = { port ->
    println(host)
    println(port)
}

fun main(args: Array<String>) {
    connectParcialCurrying("localhost")(80)
    val localConnector = connectParcialCurrying("localhostVal")
    localConnector(80)
    localConnector(8888)
}

