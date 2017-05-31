package ch07.ex1_3_2_UnaryOperators1

import java.math.BigDecimal

operator fun BigDecimal.inc() = this + BigDecimal.ONE

fun main(args: Array<String>) {
    var bd = BigDecimal.ZERO
    println(bd++)
    println(++bd)
}
