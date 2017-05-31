package ch02.ex1_2_Functions

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun main(args: Array<String>) {
    println(max(1, 2))
}
