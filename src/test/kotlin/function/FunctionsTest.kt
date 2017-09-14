package function

import org.junit.Assert
import org.junit.Test

class FunctionsTest() {

    @Test
    fun test_reverse() {

        Assert.assertEquals("!dlroW olleH", function.reverse("Hello World!"))
    }

    @Test
    fun test_anotherReverse() {

        Assert.assertEquals("!dlroW olleH", function.reverse("Hello World!"))
    }
}