package basics

fun main(args: Array<String>) {

    for (a: Int in 1..100) {
        println(a)
    }

    // better!!
    for (a in 1..100) {
        println(a)
    }

    // range as variables!
    val numbers = 1..100
    for (a in numbers) {
        println(a)
    }

    val capitals = listOf("London", "Paris", "Rome", "Madrid")
    for (capital in capitals) {
        println(capital)
    }
}
