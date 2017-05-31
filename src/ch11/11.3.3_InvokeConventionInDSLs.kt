package ch11.ex3_3_InvokeConventionInDSLs

class DependencyHandler {
    fun compile(coordinate: String) {
        println("Added dependency on $coordinate")
    }

    operator fun invoke(
            body: DependencyHandler.() -> Unit) {
        body()
    }
}

fun main(args: Array<String>) {
    val dependencies = DependencyHandler()
    dependencies.compile("org.jetbrains.kotlin:kotlin-stdlib:1.0.0")
    dependencies {
        compile("org.jetbrains.kotlin:kotlin-reflect:1.0.0")
    }
}
