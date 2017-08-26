package inheritance

// Open the person class so that i can inherit from it
open class Person {

    // open the validate function so that it can be overriden
    open fun validate() {}
}

class customer: Person() {

    override fun validate() {}
}