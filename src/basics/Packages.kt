package basics

// normal import
//import basics.util.someUtility

// named import
import basics.util.someUtility as additionalUtility

// Functions as first class citizens
fun main(args: Array<String>) {

    // Where does this come from?
    // => implicit packages! (kotlin.io)
    println("Hello World")

    // import from util
    // someUtility("Hello Utility")

    // named import
    additionalUtility("Hello Utility")

}