package ch07.ex1_2_1_CompoundAssignmentOperators

data class Point(val x: Int, val y: Int)

operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

fun main(args: Array<String>) {
    var point = Point(1, 2)
    point += Point(3, 4)
    println(point)
}
