package tidbits

import classes.CustomerKotlin

fun capitalAndPopulation(capital: String, population: Long=0): Pair<String, Long> {
    return Pair(capital, population)
}

fun main(args: Array<String>) {

    val pair = capitalAndPopulation("Madrid")
    println(pair.first)
    println(pair.second)

    // deconstructing values. Provides semantics for the pair!
    val (capital, population) = capitalAndPopulation("Madrid")
    println(capital)
    println(population)

    // deconstruction works for data classes too!
    val (id, name , email) = CustomerKotlin(124, "Villard", "villard@gmail.com")
    println(id)
    println(name)
    println(email)

    val listOfCapitalAndCountries = listOf(Pair("Paris", "France"), "Madrid" to "Spain")

    // This works for for loop as well.
    for ((cap, country) in listOfCapitalAndCountries) {
        println(cap)
        println(country)
    }


}