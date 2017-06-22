package basics

fun testVariables(args: Array<String>) {

    // mutable variables
    var streetNumber: Int
    var streetName: String = "High Street"

    // type inference, nice!
    var anotherStreetNumber = 3
    var anotherStreetName = "High Street"

    // immutable variables
    val zip = "E11 p11"

    // No primitive types!
    val number: Double

    // precision folks!
    val myLong = 10L
    val myFloat = 10f

    val myInt = 10

    // No implicit conversion
    val thisLong = myInt

    val thatLong: Long = myInt.toLong()

    // String

    val myChar = 'A'
    val myString = "My String"
    val multipleLines = """
    This is a string
    This is another line
    """

    // String interpolation
    val years = 10
    val message = "a decade is $years years"

    val name = "Mary"
    val anotherMessage = "Length of the name is ${name.length}"
}