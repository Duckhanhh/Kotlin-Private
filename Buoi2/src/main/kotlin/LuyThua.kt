fun main() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }

    val result = Math.pow(n.toDouble(), k.toDouble()).toInt()

    println(result)
}