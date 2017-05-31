package ch06.ex3_5_4_Arrays3

fun main(args: Array<String>) {
    val squares = IntArray(5) { i -> (i+1) * (i+1) }
    println(squares.joinToString())
}
