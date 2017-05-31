package ch05.ex2_1_4_FilterMap3

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.map { it.name })
}
