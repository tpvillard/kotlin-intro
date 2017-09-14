package basics.interop

import classes.CustomerJava

fun main(args: Array<String>) {

    val customer = CustomerJava()

    // I access getter and setter via properties
    customer.id = 12356

    // pretty print is of type Unit!!
    customer.prettyPrint()

    // I can extend java classes
    // I can extend java interfaces
    // No problem!!!

    // Caution when handling null coming from java

}