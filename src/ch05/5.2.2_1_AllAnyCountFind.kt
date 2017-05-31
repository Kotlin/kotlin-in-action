package ch05.ex2_2_1_AllAnyCountFind

data class Person(val name: String, val age: Int)

val canBeInClub27 = { p: Person -> p.age <= 27 }

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    println(people.all(canBeInClub27))
}
