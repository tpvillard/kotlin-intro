package tidbits

open class Person {

}

class Employee: Person() {

    fun vacations() {
        println("You dont' have vacations!")
    }
}

fun hasVacations(obj: Person) {

    if (obj is Employee) {
        // smart cast in action. compiler finds out that vacations can be applied without explicit cast.
        obj.vacations()
    }

}

val input: Any = 10
val anotherInput: Any = 10

fun main(args: Array<String>) {

    // explicit cast
    val anotherString: String? = anotherInput as? String
    println(anotherString?.length)

    // explicit cast
    val str: String = input as String
    println(str.length)

    hasVacations(Employee())
}