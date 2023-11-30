package mon11day28

/**
@version 1.0.0 2023.11.29 02:46
@author MiracleUR -> github.com/snugbrick
 */
fun main(args: Array<String>) {
    val human = Person("zhangsan", 10)

    human.printFunction()
}

class Person(name: String, val age: Int) {
    //如果构造器有注解，或者有可见度修饰符，这时constructor关键字是必须的，注解和修饰符要放在它之前。
    init {
        println("here is init")//这是初始化
    }

    //此为二级构造函数，必须包含一级构造函数的所有内容并扩展，需要以：形式来继承上一级构造函数
    constructor(name: String, age: Int, human: String) : this(name, age) {
        println("name is $human")
    }

    fun printFunction() {
        println("hello")
    }
}

class whatisThis() {
    constructor(human: String, age: Int) : this() {
        println("name is $human")
    }
}
class noConstructor private constructor () {
}
