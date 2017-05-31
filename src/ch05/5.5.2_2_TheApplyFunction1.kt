package ch05.ex5_2_2_TheApplyFunction1

fun alphabet() = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}

fun main(args: Array<String>) {
    println(alphabet())
}
