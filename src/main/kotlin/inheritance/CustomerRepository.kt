package inheritance

import classes.Customer


interface CustomerRepository {

    fun store (obj: Customer) {
        // methods in interface can have implementations like in java 8
        // no state in there
    }

    fun getById(id: Int): Customer
}

interface EmployeeRepository {

    fun store(obj: Employee)

    fun getById(id: Int): Employee
}

class SQLCustomerRepository: CustomerRepository {
    override fun getById(id: Int): Customer {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    // No need to implement store in here. Default implementation is used.

}


interface Interface1 {

    fun func() {
        println("func from interface1")
    }
}

interface Interface2 {

    fun func() {
        println("func from interface2")
    }
}

class Class1And2: Interface1, Interface2 {
    override fun func() {
        super<Interface2>.func()
    }
// Can override the
//    override fun func() {
//        println("This is our own")
//    }
}

fun main(args: Array<String>) {
    val class1and2 = Class1And2()
    class1and2.func()
}