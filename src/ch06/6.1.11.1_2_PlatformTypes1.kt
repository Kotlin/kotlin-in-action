package ch06.ex1_11_1_2_PlatformTypes1

import ch06.Person

fun yellAtSafe(person: Person) {
    println((person.name ?: "Anyone").toUpperCase() + "!!!")
}

fun main(args: Array<String>) {
    yellAtSafe(Person(null))
}
