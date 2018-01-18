package advanced.functions

fun foo(fooParam: String) {

    val param = "aParam"

    // inner function declaration
    fun bar(barParam: String) {

        // inner function have access to outer parameters
        println(fooParam)
        println(barParam)
        println(param)
    }
}

fun main(args: Array<String>) {

    foo("foo")
    // bar is not visible!
    // bar()
}
