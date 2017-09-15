package main

import functional.toTitleCase

fun main(args: Array<String>) {
    val message = "hello from IDEA!"

    // I can use extension functions as long as they are imported in the package
    println(message.toTitleCase())
}
