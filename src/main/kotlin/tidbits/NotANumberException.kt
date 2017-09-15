package tidbits

import java.io.BufferedReader
import java.io.FileReader

class NotANumberException(message: String) : Throwable(message) {
}

fun notANumber(obj: Any) {
    when (obj) {
        !is Int, Long, Double, Float -> throw NotANumberException("This is not a number")
    }
}

fun main(args: Array<String>) {

    try {
        notANumber("A")
    } catch (e: NotANumberException) {
        println(e.message)
    }

    val buffer = BufferedReader(FileReader("input.txt"))
    try {
        val chars = CharArray(30)
        buffer.read(chars, 0, 40)
    } finally {
        println("closed")
        buffer.close()
    }
}