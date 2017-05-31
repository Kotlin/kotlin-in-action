package ch09.ex1_1_2_GenericFunctionsAndProperties1

val <T> List<T>.penultimate: T
    get() = this[size - 2]

fun main(args: Array<String>) {
    println(listOf(1, 2, 3, 4).penultimate)
}
