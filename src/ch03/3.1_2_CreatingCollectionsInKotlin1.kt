package ch03.ex1_2_CreatingCollectionsInKotlin1

fun main(args: Array<String>) {
    val strings = listOf("first", "second", "fourteenth")
    println(strings.last())
    val numbers = setOf(1, 14, 2)
    println(numbers.max())
}
