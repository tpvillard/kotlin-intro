package function

import java.util.*

fun fibonacciBruteForce(n: Int): Int {

    println("calling with n: $n")
    return when (n) {
        0 -> 0
        1 -> 1
        else -> fibonacciBruteForce(n - 1) + fibonacciBruteForce(n - 2)
    }
}


fun fibonacci(n: Int): Int {

    println("calling with n: $n")
    val values = IntArray(n + 1)
    values[0] = 0;
    values[1] = 1;
    for (i in 2..n) {
        values[i] = values[i - 1] + values[i - 2]
    }
    return values[n]
}

fun fibonacciBetter(n: Int): Int {

    if (n == 0) {
        return 0;
    }
    var fn2 = 0
    var fn1 = 1
    var fn = 1
    for (i in 2..n) {
        fn = fn1 + fn2
        fn2 = fn1
        fn1 = fn
    }
    return fn
}

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    scanner.close()
    println(fibonacci(n))
}