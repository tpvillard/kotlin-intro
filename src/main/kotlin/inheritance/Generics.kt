package inheritance

import classes.Customer

// Hover interface and do Alt inter to pop up implement interface dialog
interface repository<T> {
    fun store(obj: T)

    fun getById(id: Int): T

    fun getAll(): List<T>
}

// or

interface Repo {
    fun <T> getById(id: Int): T
    fun <T> getAll(): List<T>
}

class GenericRepo: Repo {
    override fun <T> getById(id: Int): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T> getAll(): List<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

fun main(args: Array<String>) {
    val repo = GenericRepository<Customer>()
    val customers = repo.getAll()
}
