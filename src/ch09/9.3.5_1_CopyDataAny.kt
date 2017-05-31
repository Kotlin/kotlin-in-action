package ch09.CopyDataAny

fun <T: R, R> copyData(source: MutableList<T>,
                       destination: MutableList<R>) {
    for (item in source) {
        destination.add(item)
    }
}

fun main(args: Array<String>) {
    val ints = mutableListOf(1, 2, 3)
    val anyItems = mutableListOf<Any>()
    copyData(ints, anyItems)
    println(anyItems)
}
