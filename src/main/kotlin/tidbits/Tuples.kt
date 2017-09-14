package tidbits

import classes.Customer
import classes.CustomerKotlin

fun capitalAndPopulation(capital: String): Pair<String, Long> {
    return Pair("Madrid", 2300000)
}

fun main(args: Array<String>) {

    val pair = capitalAndPopulation("Madrid")
    println(pair.first)
    println(pair.second)

    // deconsturcting values. Provides semantics for the pair!
    val (capital, population) = capitalAndPopulation("Madrid")
    println(capital)
    println(population)

    // deconstruction works for data classes too!
    val (id, name , email) = CustomerKotlin(124, "Villard", "villard@gmail.com")
    println(id)
    println(name)

    val listOfCapitalAndCountries = listOf(Pair("Paris", "France"), "Madrird" to "Spain")

    // This works for for loop as well.
    for ((capital, country) in listOfCapitalAndCountries) {
        println(capital)
        println(country)
    }


}