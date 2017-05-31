package ch06.ex3_5_3_Arrays2

fun main(args: Array<String>) {
    val strings = listOf("a", "b", "c")
    println("%s/%s/%s".format(*strings.toTypedArray()))
}
