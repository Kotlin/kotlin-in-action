package ch08.ex1_6_4_RemovingDuplicationThroughLambdas3

data class SiteVisit(
    val path: String,
    val duration: Double,
    val os: OS
)

enum class OS { WINDOWS, LINUX, MAC, IOS, ANDROID }

val log = listOf(
    SiteVisit("/", 34.0, OS.WINDOWS),
    SiteVisit("/", 22.0, OS.MAC),
    SiteVisit("/login", 12.0, OS.WINDOWS),
    SiteVisit("/signup", 8.0, OS.IOS),
    SiteVisit("/", 16.3, OS.ANDROID)
)

fun List<SiteVisit>.averageDurationFor(predicate: (SiteVisit) -> Boolean) =
        filter(predicate).map(SiteVisit::duration).average()

fun main(args: Array<String>) {
    println(log.averageDurationFor {
        it.os in setOf(OS.ANDROID, OS.IOS) })
    println(log.averageDurationFor {
        it.os == OS.IOS && it.path == "/signup" })
}
