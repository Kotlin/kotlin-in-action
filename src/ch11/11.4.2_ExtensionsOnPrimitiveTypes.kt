package ch11.ex4_2_ExtensionsOnPrimitiveTypes

import java.util.Date
import java.time.Period
import java.time.LocalDate

val Int.days: Period
    get() = Period.ofDays(this)

val Period.ago: LocalDate
    get() = LocalDate.now() - this

val Period.fromNow: LocalDate
    get() = LocalDate.now() + this

fun main(args: Array<String>) {
    println(1.days.ago)
    println(1.days.fromNow)
}
