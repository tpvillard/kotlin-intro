package basics

fun main(args: Array<String>) {

    val myString = "Not Empty"
    if (myString != "") {
        println("myString not empty")
    } else {
        println("myString is empty")
    }

    // if used as an expression
    val result = if (myString != "") {
        "myString not empty"
    } else {
        "myString is empty"
    }
    println(result)

    // Using when
    // Don't need break. The first match breaks
    when (result) {
        is String -> println("Excellent")
        "Value" -> println("It is a value")
    }

    // Using when as an expression
    val anotherResult = when (result) {
        is String -> "Excellent"
        "Value" -> "It is a value"
        // else is mandatory in such case
        else -> "We ended up here"
    }
    println(anotherResult)
}
