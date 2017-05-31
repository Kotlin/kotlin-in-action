package ch08.ex2_3_2_InliningCollectionOperations1

data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))

fun main(args: Array<String>) {
    println(people.filter { it.age > 30 }
                  .map(Person::name))
}
