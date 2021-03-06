package function

// in fact in kotlin "void" functions return Unit
fun anotherHello(): Unit {
    println("Hello")
}

// Nothing can be used to indicate that a function throws an exception.
// This function never returns, it just throws an exception
fun throwExceptions(): Nothing {
    throw Exception("This function throws an exception")
}

fun returns4(): Int {
    return 4
}

// type inference works for functions too
fun returns5() = 5

fun sum(x :Int, y :Int):Int {
    return x + y
}

// Condensed version with type inference
fun anotherSum(x: Int, y :Int) = x + y

// default parameters
fun anotherSumWithDefault(x: Int, y :Int, z :Int = 0) = x + y + z

fun printDetails(name :String, email :String = "", phone :String) {
    println("name: $name, email: $email, phone: $phone")
}

fun printStrings(vararg strings: String) {

    for (string in strings) {
        println(string)
    }
}

fun anotherReverse(aString: String): String {

    val values = aString.toCharArray()
    for (i in 0..values.size / 2) {
        val c = values[i]
        values[i] = values[values.size - 1 - i]
        values[values.size - 1 - i] = c
    }
    return values.toString()
}

fun reverse(aString: String): String {
    var res = ""
    val values = aString.toCharArray()
    for (i in values.size - 1 downTo 0) {
        res = res + values[i]
    }
    return res
}

fun getDuplicates(values: Array<Int>): Array<out Any>? {
    val set = HashSet<Int>()
    val res = HashSet<Int>()
    for (i in 0 until values.size - 1) {
        if (set.contains(values[i])) {
            res.add(values[i])
        }
        set.add(values[i])
    }
    return res.toArray();
}

// Caution when passing in varargs

fun anotherPrintStrings(vararg strings: String) {

    // This does not work
    // reallyPrintStrings(strings)

    // I need to specify the spread operator to make it work
    reallyPrintStrings(*strings)
}

// package private functions
private fun reallyPrintStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}


fun main(args: Array<String>) {
    anotherHello()
    val value = returns4()
    println(anotherSum(3, 4))

    // Call function with default. Avoid overloading functions
    println(anotherSum(3, 4))

    // Using named parameters
    printDetails("Roger", phone = "01 55 66 55 55")
    // Change the parameters order.
    // Use with care, usually it is better to have a data object in such case!
    printDetails("Roger", phone = "01 55 66 55 55", email = "roger.gicquel@gmail.com")

    printStrings("1")
    printStrings("1", "2") // Nice tip here! Ctrl D to duplicate the line
    printStrings("1", "2", "3")
    printStrings("1", "2", "3", "4")
    println(reverse("helloworld"))
}