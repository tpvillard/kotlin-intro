package advanced.functions


// higher order function.
fun op(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun main(args: Array<String>) {

    // use of the higher order function using a lambda
    op(3, {it * it})

    // use of the higher order function using an anonymous function.
    // anonymous functions allows multiple return statement.
    op( 2, fun(x): Int {
        if (x > 10) {
            return 0
        } else {
            return x * x
        }
    })
}
