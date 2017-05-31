package ch07.LazyEmails

class Email { /*...*/ }
fun loadEmails(person: Person): List<Email> {
    println("Load emails for ${person.name}")
    return listOf(/*...*/)
}

class Person(val name: String) {
    private var _emails: List<Email>? = null

    val emails: List<Email>
       get() {
           if (_emails == null) {
               _emails = loadEmails(this)
           }
           return _emails!!
       }
}

fun main(args: Array<String>) {
    val p = Person("Alice")
    p.emails
    p.emails
}
