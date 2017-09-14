package classes

import org.junit.Assert
import org.junit.Test

class CustomerKotlinTest() {

    @Test
    fun testCustomerKotlin() {

        val customer = CustomerKotlin(id=1, name="rgicquel",email="rgicquel@gmail.com")
        Assert.assertEquals("id=1, email=rgicquel@gmail.com, name=rgicquel", customer.toString())

    }
}