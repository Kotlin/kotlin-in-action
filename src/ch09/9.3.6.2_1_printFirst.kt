package ch09.printFirst

fun printFirst(list: List<*>) {
    if (list.isNotEmpty()) {
        println(list.first())
    }
}

fun main(args: Array<String>) {
    printFirst(listOf("Svetlana", "Dmitry"))
}
