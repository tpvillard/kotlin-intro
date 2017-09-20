package stdlib

import java.util.*

fun main(args: Array<String>) {

    // cities is immutable
    val cities = listOf("Madrid", "Paris", "London")
    val emptyList = emptyList<String>()
    println(cities.javaClass)
    println(emptyList.javaClass)

    val arrayList = Arrays.asList("London", "Paris")
    println(arrayList.javaClass)

    // A mutable list
    val mutableList = mutableListOf("London")
    mutableList.add("Paris")

    // same with maps

    // primitive array
    val booleanArray = booleanArrayOf(true, false)
}
