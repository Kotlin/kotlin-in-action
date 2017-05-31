package ch10.ex2_1_2_ReflectionAPI1

fun foo(x: Int) = println(x)

fun main(args: Array<String>) {
    val kFunction = ::foo
    kFunction.call(42)
}
