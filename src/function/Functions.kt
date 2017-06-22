package function

fun hello() {
    println("Hello")
}

// in fact in kotlin "void" functions return Unit
fun anotherHello(): Unit {
    println("Hello")
}

// Nothing can be used to indicate that a function throws an exception.
// This function never returns, it just throws an exception
fun throwExceptions(): Nothing {
    throw Exception("This function throws an exception")
}

fun returns4(): Int {
    return 4
}

// type inference works for functions too
fun returns5() {
    // Hum actually it does not but this is because i'm not using kotlin 1.1
    //return 5
}

fun sum(x :Int, y :Int):Int {
    return x + y
}

// Condensed version with type inference
fun anotherSum(x: Int, y :Int) = x + y

fun main(args: Array<String>) {
    hello()
    anotherHello()
    val value = returns4()
    println(anotherSum(3, 4))
}