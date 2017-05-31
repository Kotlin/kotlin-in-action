package ch09.ex2_1_2_GenericsAtRuntimeTypeChecksAndCasts1

fun printSum(c: Collection<Int>) {
    if (c is List<Int>) {
        println(c.sum())
    }
}

fun main(args: Array<String>) {
    printSum(listOf(1, 2, 3))
}
