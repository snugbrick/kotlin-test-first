fun main(args: Array<String>) {
    val name: String = "沙伯亿"
    val num: Int = 114514

    val names: String = "abc"
    val ages: Int = 1919810

    intTest(num)
    stringTest(name)

/*
    val logs:String="嘻嘻"
    aLog(logs)
 */

    Person(names, ages).getName();

    for (i in 4 downTo 1 step 2) println(i)

    for (i in 1..4 step 2) println(i)
}

class Person(private val names: String, private val ages: Int) {
    fun getName(): String {
        return "you are $names"
    }

    fun getAge(): Int {
        return ages
    }

    fun getVoid(): Unit {
        val voidInt: Int = ages ?: -1//age为空返回-1，不做处理返回 null
        val nullPointExc: Int = ages!!//age为空抛出异常
    }

    fun getMultiple(vararg a: Int, b: String, c: String, obj: Any): Int? {//当 a 中的字符串内容不是一个整数时, 返回 null:
        val Intb = parseInt(b)
        val Intc = parseInt(c)

        if (obj is String) {//obj是否为String实例
            println(b + c)
        }

        return a.firstOrNull();
    }

    fun parseInt(str: String): Int? {
        return str.toIntOrNull()
    }
    fun main(args: Array<String>) {
        val text = """
    |多行字符串
    |菜鸟教程
    |多行字符串
    |Runoob
    """.trimMargin()
        println(text)    // 前置空格删除了
    }
}