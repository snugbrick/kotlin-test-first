package mon11day28

/**
@version 1.0.0 2023.11.28 02:13
@author MiracleUR -> github.com/snugbrick
 */
fun main(args: Array<String>) {
    val cite = justClassTest(firstName = "ant")

    val name = cite.name
    println(name)
}

class justClassTest(firstName: String) {
    var name = firstName
    var age = 114514

    var lastName: String = "zhang"
        get() = field.uppercase()   // 将变量赋值后转换为大写
        set(value) {
            if (value.equals("shabi")) {
                field = value
            } else {
                println("叉出去！")
            }
        }
    var heiht: Float = 145.4f
        private set


    lateinit var subject: String

    fun test() {
    }
}
