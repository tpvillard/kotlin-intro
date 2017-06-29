package classes

enum class Priority {
    MINOR,
    MAJOR,
    CRITICAL
}

enum class AnotherPriority(val value: Int) {

    MINOR(0) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    MAJOR(1) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    CRITICAL(2) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    };

    // This does not compile, hum. I should be using the latest version of kotlin?
    // I then need to provide an implementation for each enum value.
    abstract fun text(): String
}


fun main(args: Array<String>) {

    val priority = Priority.CRITICAL
    println(priority)

    val anotherPriority = AnotherPriority.CRITICAL
    println(anotherPriority.value)

    for (priorityInList in Priority.values()) {
        println(priorityInList)
    }

    val p = Priority.valueOf("CRITICAL")
    println(p)
}