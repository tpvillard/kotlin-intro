package classes

// Kotlin allows to create Objects without any class.
// Really nice to implement singleton!
object Global {
    val PI = 3.14
}

fun main(args: Array<String>) {

    // object expression!
    val localObject = object {
        val PI = 3.14159
    }
    println(Global.PI)
    println(localObject.PI)
}