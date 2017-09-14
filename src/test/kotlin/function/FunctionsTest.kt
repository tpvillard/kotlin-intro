package function

import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test

class FunctionsTest() {

    @Test
    fun test_reverse() {

        assertEquals("!dlroW olleH", reverse("Hello World!"))
    }

    @Test
    fun test_anotherReverse() {

        assertEquals("!dlroW olleH", reverse("Hello World!"))
    }

    @Test
    fun test_getDuplicates() {

        val values = arrayOf(1, 1, 2 ,3, 4, 5, 5, 6, 6, 6, 8, 9, 10)
        val expected = arrayOf(1, 5, 6)
        assertEquals(expected, getDuplicates(values = values))
    }
}