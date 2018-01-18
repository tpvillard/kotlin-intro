package advanced.functions

// Extension methods
infix fun String.shouldBeEqualsTo(value: String) =  this == value

fun main(args: Array<String>) {

    // infix notation is equivalent to the function call below.
    // "Hello".shouldBeEqualsTo("Hello")
    // only applicable to extension function or member function that a single parameter.
    "Hello" shouldBeEqualsTo "Hello"
}