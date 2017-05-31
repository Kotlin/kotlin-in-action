package ch07.ex4_3_DestructuringDeclarations2

import java.io.File

data class NameComponents(
        val name: String,
        val extension: String)

fun splitFilename(fullName: String): NameComponents {
    val (name, extension) = fullName.split('.', limit = 2)
    return NameComponents(name, extension)
}

fun main(args: Array<String>) {
    val (name, ext) = splitFilename("example.kt")
    println(name)
    println(ext)
}
