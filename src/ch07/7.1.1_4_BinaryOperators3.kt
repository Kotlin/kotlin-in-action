package ch07.ex1_1_4_BinaryOperators3

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

fun main(args: Array<String>) {
    println('a' * 3)
}
