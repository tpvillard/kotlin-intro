package inheritance

abstract class StoredEntity {

}

class Employee: StoredEntity() {

}

fun main(args: Array<String>) {

    val entity = Employee()
}
