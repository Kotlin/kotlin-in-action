package ch06.ex1_1_NullableTypes

fun strLenSafe(s: String?): Int =
    if (s != null) s.length else 0

fun main(args: Array<String>) {
    val x: String? = null
    println(strLenSafe(x))
    println(strLenSafe("abc"))
}
