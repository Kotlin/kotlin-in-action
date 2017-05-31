package ch06.ex2_6_NothingType

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}

fun main(args: Array<String>) {
    fail("Error occurred")
}
