package ch06.ex1_5_SafeCastsAs

class Person(val firstName: String, val lastName: String) {
   override fun equals(o: Any?): Boolean {
      val otherPerson = o as? Person ?: return false

      return otherPerson.firstName == firstName &&
             otherPerson.lastName == lastName
   }

   override fun hashCode(): Int =
      firstName.hashCode() * 37 + lastName.hashCode()
}

fun main(args: Array<String>) {
    val p1 = Person("Dmitry", "Jemerov")
    val p2 = Person("Dmitry", "Jemerov")
    println(p1 == p2)
    println(p1.equals(42))
}
