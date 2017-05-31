package ch04.ex1_1_1_InterfacesInKotlin

interface Clickable {
    fun click()
}
class Button : Clickable {
    override fun click() = println("I was clicked")
}

fun main(args: Array<String>) {
    Button().click()
}
