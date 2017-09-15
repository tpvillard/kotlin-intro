package functional

// Extension functions allows to extend a class (a type) without inheriting from it
// inspired by C sharp!

fun String.hello() {
    println("It's me")
}

fun String.toTitleCase(): String {
    // this refers to the receiver object
    return this.split(" ").joinToString (" ") { it.capitalize() }
}

class Customer {
    fun makePreferred() {
        println("Customer version")
    }
}

fun Customer.makePreferred() {
    println("Extended version")
}

open class BaseClass
class InheritClass: BaseClass()

fun BaseClass.extension() {
    println("extension in base")
}

fun InheritClass.extension() {
    println("extension in inherit")
}

fun main(args: Array<String>) {
    "Hello".hello()
    println("apocalypse now".toTitleCase())

    // the menber method is always preferred to the extended version.
    val customer = Customer()
    customer.makePreferred()

    // extension functions are statically resolved.
    // even though we're poiting to the inherit instance, the base class extension will be used
    val instance: BaseClass = InheritClass()
    instance.extension()
}