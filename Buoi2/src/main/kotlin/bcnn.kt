import java.util.Scanner;
fun findLCM(a: Int, b: Int, c: Int): Int {
    fun lcm(x: Int, y: Int): Int {
        var tempX = x
        var tempY = y
        while (tempY != 0) {
            val temp = tempY
            tempY = tempX % tempY
            tempX = temp
        }
        return (x * y) / tempX
    }

    val lcmAB = lcm(a, b)
    val lcmABC = lcm(lcmAB, c)
    return lcmABC
}

fun main() {
    val (num1, num2, num3) = readln().split(' ').map { it.toInt() }
    val lcm = findLCM(num1, num2, num3)
    println(lcm)
}