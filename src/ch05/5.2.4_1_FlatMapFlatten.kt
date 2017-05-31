package ch05.ex2_4_1_FlatMapFlatten

fun main(args: Array<String>) {
    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })
}
