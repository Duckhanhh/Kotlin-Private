fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }

    var sum = 0

    for (i in 1 .. a) {
        if (a % i == 0 && b % i != 0) {
            sum += i
        }
    }
    println(sum)
}