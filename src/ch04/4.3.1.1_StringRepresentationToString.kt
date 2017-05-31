package ch04.ex3_1_1_StringRepresentationToString

class Client(val name: String, val postalCode: Int) {
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
}

fun main(args: Array<String>) {
    val client1 = Client("Alice", 342562)
    println(client1)
}
