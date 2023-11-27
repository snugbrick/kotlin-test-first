package mon11day27

/**
@version 1.0.0 2023.11.27 01:02
@author MiracleUR -> github.com/snugbrick
 */
fun ifelseTest() {
    val a = 10
    val b = 20
    val max = if (a > b) {
        println("a > b")
        a
    } else {
        println("a < b")
        b
    }
    println("max = $max")
}