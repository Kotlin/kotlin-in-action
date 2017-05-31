package ch09.ex2_2_2_DeclaringFunctionsWithReifiedTypeParameters1

fun main(args: Array<String>) {
    val items = listOf("one", 2, "three")
    println(items.filterIsInstance<String>())
}
