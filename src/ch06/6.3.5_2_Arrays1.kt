package ch06.ex3_5_2_Arrays1

fun main(args: Array<String>) {
    val letters = Array<String>(26) { i -> ('a' + i).toString() }
    println(letters.joinToString(""))
}
