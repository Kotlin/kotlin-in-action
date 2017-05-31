package ch11.ex2_1_2_LambdasWithReceivers1

fun buildString(
        builderAction: StringBuilder.() -> Unit
) : String {
    val sb = StringBuilder()
    sb.builderAction()
    return sb.toString()
}

fun main(args: Array<String>) {
    val s = buildString {
        this.append("Hello, ")
        append("World!")
    }
    println(s)
}
