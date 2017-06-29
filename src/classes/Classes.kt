package classes

import java.util.*

// No constructor
class Customer {
    // No such thing as field. rather properties
    var id = 0
    var name: String = ""
}

// Another version with a constructor with mutable properties
class CustomerVersion1(var id: Int, var name: String) {

}

// Another version with a constructor with immutable properties
class CustomerVersion2(val id: Int, val name: String) {

}

// Another version with default values and initialization block
class CustomerVersion3(var id: Int, var name: String = "") {
    init {
        name = name.toUpperCase()
    }

    // secondary constructors extending primary ones...
    // I don't really get it. What is the purpose? is email a property ? nope!
    // So what is the use then...
    constructor(email: String) : this(0, "") {

    }
}

// Class with custom getter and setter for properties
// introduce methods too!
class CustomerVersion4(var id: Int, var name: String = "", val yearOfBirth: Int) {

    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var socialSecurityNumber: String = ""
        set(value) {
            if (!value.startsWith("SN")) {
                throw IllegalArgumentException("Social security number must start with SN")
            }
            // Don't forget to set the property backing field!
            field = value
        }

    fun printCustomerAsString() {
        println("id: $id, name: $name, age: $age, socialSecurityNumber: $socialSecurityNumber")
    }
}

fun test(args: Array<String>) {

    // No new keyword !!
    var roger = Customer()
    roger.id = 10
    roger.name = "roger"

    var rogerVersion1 = CustomerVersion1(1, "roger")
    rogerVersion1.id = 2

    var rogerVersion2 = CustomerVersion2(3, "roger")
    // Can't do that!
    // rogerVersion2.id = 4

    var rogerVersion3 = CustomerVersion3(4)

    var thomas = CustomerVersion4(5, "thomas", 1968)
    // thomas.socialSecurityNumber = "1680869blablabla"
    thomas.socialSecurityNumber = "SNblablabla"
    println(thomas.socialSecurityNumber)
    thomas.printCustomerAsString()
}

/*
About visibility:

by default everything is public.

top level declaration visibility (classes, functions)

public:
private: only visible in the file where it is declared
internal: only visible in the same module (what does it mean module?

for class properties

public
private: only available to class members
protected: only available to class members and subclasses
internal: any client inside the module!

 */