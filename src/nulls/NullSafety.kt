package nulls

class Service {
    fun evaluate() {

    }
}

class ServiceProvider {
    fun createService(): Service? {
        return null
    }
}

fun main(args: Array<String>) {

    // This does not compile!
    //val message: String = null
    val message = "ok string"

    // nullable type <T>?
    val nullMessage :String? = null

    // Ctrl W: extend selection
    println(message.length)

    // This does not compile
    //println(nullMessage.length)

    // But it works with the elvis operator
    println(nullMessage?.length)

    // Tell the compiler, don't worry about that
    println(nullMessage!!.length)

    val sp = ServiceProvider()

    // elvis in action on method calls!
    sp.createService()?.evaluate()
}