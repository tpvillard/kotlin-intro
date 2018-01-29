package advanced.functions

/**
 * inline means the whole function block will be copied at each call site.
 * this allows performance improvements at the cost of copying code at each and every call site.
 * This is only relevant when the function defines a lambda expression.
 * Without lambda no performance improvement is expected.
 */
inline fun operation(op: () -> Unit) {

    println("Before calling op")
    op()
    println("After calling op")
}

fun main(args: Array<String>) {

    // The op() function will be copied here.
    operation { println("Calling op()") }
}
