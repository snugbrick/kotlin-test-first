package mon11day28

/**
@version 1.0.0 2023.11.29 03:36
@author MiracleUR -> github.com/snugbrick
 */

fun main(args: Array<String>) {
    val mainUser = Main().f()//实现
}

class Main : anSon() {
    override fun f() {
        println("well done")
    }//实现抽象
}

open class Animal() {
    open fun f() {}
}

abstract class anSon : Animal() {
    abstract override fun f()
}