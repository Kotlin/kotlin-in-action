package ch10.ex2_1_3_ReflectionAPI2

var counter = 0

fun main(args: Array<String>) {
    val kProperty = ::counter
    kProperty.setter.call(21)
    println(kProperty.get())
}
