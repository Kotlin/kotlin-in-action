package ch11.ex2_1_4_LambdasWithReceivers3

fun main(args: Array<String>) {
    val map = mutableMapOf(1 to "one")
    map.apply { this[2] = "two"}
    with (map) { this[3] = "three" }
    println(map)
}
