package ch02.ex1_4_2_StringTemplates1

fun main(args: Array<String>) {
    if (args.size > 0) {
        println("Hello, ${args[0]}!")
    }
}
