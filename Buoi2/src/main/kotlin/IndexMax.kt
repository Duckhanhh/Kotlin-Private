fun main() {
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }

    var maxIndex = 0
    var maxValue = arr[0]

    for (i in 1 until n) {
        if (arr[i] > maxValue) {
            maxValue = arr[i]
            maxIndex = i
        }
    }

    println(maxIndex + 1)
}