package classes

// data class = standard kotlin class + toString() hashCode() and equals()
data class CustomerKotlin(var id: Int, var name: String, var email: String) {

    // Still possible to override default methods provided by data classes
    override fun toString(): String {
        return "id=$id, email=$email, name=$name"
    }
}

fun main(args: Array<String>) {

    var customer1 = CustomerKotlin(1, "Thomas", "thomas@gmail.com")
    var customer2 = CustomerKotlin(1, "Thomas", "thomas@gmail.com")
    println(customer1)

    // "==" overload equals() in kotlin!
    if (customer1 == customer2) {
        println("customer1 & customer2 are equals")
    }

    // copy() is provided by data classes
    val customer3 = customer1.copy()

}