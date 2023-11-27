package mon11day27

/**
@version 1.0.0 2023.11.27 20:36
@author MiracleUR -> github.com/snugbrick
 */
fun main(args: Array<String>) {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}
