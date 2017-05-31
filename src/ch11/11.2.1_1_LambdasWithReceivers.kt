package ch11.ex2_1_1_LambdasWithReceivers

fun buildString(
        builderAction: (StringBuilder) -> Unit
): String {
    val sb = StringBuilder()
    builderAction(sb)
    return sb.toString()
}

fun main(args: Array<String>) {
    val s = buildString {
        it.append("Hello, ")
        it.append("World!")
    }
    println(s)
}
