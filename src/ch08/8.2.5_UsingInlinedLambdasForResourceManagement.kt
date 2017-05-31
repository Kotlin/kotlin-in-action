package ch08.ex2_5_UsingInlinedLambdasForResourceManagement

import java.io.BufferedReader
import java.io.FileReader
import java.io.File

fun readFirstLineFromFile(path: String): String {
    BufferedReader(FileReader(path)).use { br ->
        return br.readLine()
    }
}
