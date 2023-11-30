package mon12day1

import java.javaFatherClass

/**
@version 1.0.0 2023.12.01 00:53
@author MiracleUR -> github.com/snugbrick
 */
fun main(args: Array<String>) {
    val son = sonClass("ab", 114514, "sb school")
    son.printFun()

    val javaSon = javaSonClass("java", 114514)
    javaSon.printer()
}

class sonClass(name: String, age: Int, val school: String) : fatherClass(name, age) {
    fun printFun() {
        println("My name is $name,I come from $school,I'm $age years old")
    }
}

class javaSonClass(printing: String, age: Int) : javaFatherClass() {
    private val printinger = super.printMethod(printing)
    fun printer() {
        println(printinger)
    }
}

open class fatherClass(val name: String, val age: Int) {

}