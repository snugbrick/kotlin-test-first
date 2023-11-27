package mon11day27

/**
@version 1.0.0 2023.11.27 02:39
@author MiracleUR -> github.com/snugbrick
 */
fun main(args: Array<String>) {
    val i = 1

    when (i) {
        2 -> println(i + 2)
        1 -> println(i + 1)
        else -> {
            println("else")
        }
    }


    // 嵌套的函数字面量（无名函数）
    val myFunction = {
        val a = 114514
        println(a)
    }

    // 调用嵌套的函数字面量
    myFunction()
}

