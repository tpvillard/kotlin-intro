package classes

import java.io.IOException

// data class = standard kotlin class + toString() hashCode() and equals()
data class CustomerKotlin(var id: Int, var name: String, var email: String) {

    var aProperty = "My Property"

    // This turns the property into a real field.
    // What is the use?
    @JvmField var anotherProperty = "My Property"

    @JvmOverloads fun changeStatus(status: Status = Status.CURRENT) {

    }

    // Still possible to override default methods provided by data classes
    override fun toString(): String {
        return "id=$id, email=$email, name=$name"
    }

    // to indicate to Java that this method may raise a checked IOException
    @Throws(IOException::class) fun loadStatistics(filename: String) {
        if (filename == "") {
            throw IOException("filename can't be blank!!")
        }
    }
}

// extension function
fun CustomerKotlin.extension() {

}

enum class Status {
    CURRENT,
    PAST
}

fun main(args: Array<String>) {

    val customer1 = CustomerKotlin(1, "Thomas", "thomas@gmail.com")
    val customer2 = CustomerKotlin(1, "Thomas", "thomas@gmail.com")
    println(customer1)

    // "==" overload equals() in kotlin!
    if (customer1 == customer2) {
        println("customer1 & customer2 are equals")
    }

    // copy() is provided by data classes
    val customer3 = customer1.copy()

}