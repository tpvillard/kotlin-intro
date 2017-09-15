package functional

// This is a closure: it captures the variable.
// I'm not sure this is really useful!!
fun outsideFunction() {
    val number = 10
    unaryFunction(6, { x -> x * number })
}

fun anotherOutsideFunction() {
    for (number in 1..30) {
        unaryFunction(1, { x ->
            println(number)
            x * number }
        )
    }
}

fun main(args: Array<String>) {

    anotherOutsideFunction()
}