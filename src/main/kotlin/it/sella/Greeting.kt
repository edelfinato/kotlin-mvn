package it.sella

/**
 * A function to say hello to given user.
 *
 * @param name user name, optional
 * @return greeting string to given user
 *
 */
fun sayHi(name: String = "World"): String = "Hello $name!"

fun main(args: Array<String>) {
    println(sayHi("Bancarella"))
    val list = listOf(",", 1, true)
    list.forEach { println(it.javaClass.componentType) }
}