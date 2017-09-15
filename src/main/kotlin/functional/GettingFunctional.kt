package functional

// higher order functions is the ability to pass functions as parameters to functions
// and also to return a function from a function

fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

// function taking an int and a function returning void
fun operation(x: Int, op: (Int) -> Unit) {

}

fun unaryFunction(x: Int, op: (Int) -> Int) {
    op(x)
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun transaction(db: Database, code: () -> Unit ) {

    try {
        code()
    } finally {
        db.commit()
    }
}

class Database {
    fun commit() {

    }
}

fun main(args: Array<String>) {
    println(operation(3, 4, ::sum))

    // Lambda expression: give the function block directly without actually declaring the function
    // kotlin infers the type!
    operation(4, 7, { x, y -> x + y })


    unaryFunction(5, { x -> x * x })

    // In the case where the lambda expression takes only one argument just use it (as in groovy)
    unaryFunction(5, { it * it})

    // Another way of expressing this, is:
    // the lambda expression should be the last parameter of the call
    unaryFunction(5) { it * it }

    val db = Database();

    // thanks to the way lambda can be expressed, one can have the feeling that transaction becomes
    // a new keyword of the language!
    transaction(db) {
        // read from database
    }

    // dsl domain specific language: create code that has a semantic that is closed to the domain
    // in which it operates. Kotlin is nice for creating dsl.

    // Anonymous function
    // Strange why would we need that compared to a lambda expression?
    // RH says that it allows multiple returns.
    unaryFunction(6, fun (x: Int): Int { return x * x })

    // But we can have multiple returns here!!! Not clear
    unaryFunction(5, { x -> if (x > 5) x * x else  x - x })


}
