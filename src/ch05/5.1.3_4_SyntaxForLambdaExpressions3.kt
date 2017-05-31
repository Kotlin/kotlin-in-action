package ch05.ex1_3_4_SyntaxForLambdaExpressions3

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    val names = people.joinToString(separator = " ",
                          transform = { p: Person -> p.name })
    println(names)
}
