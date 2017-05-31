package ch09.ex3_6_2_2_StarProjection1

fun <T> printFirst(list: List<T>) {
    if (list.isNotEmpty()) {
        println(list.first())
    }
}

fun main(args: Array<String>) {
    printFirst(listOf("Svetlana", "Dmitry"))
}
