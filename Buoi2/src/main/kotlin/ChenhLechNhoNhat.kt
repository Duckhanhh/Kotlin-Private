    fun main() {
        val n = readln().toInt()
        val arr = readln().split(" ").map { it.toInt() }
        val sortedArr = arr.sorted()
        var minDiff = Int.MAX_VALUE

        for (i in 1 until n) {
            val diff = sortedArr[i] - sortedArr[i - 1]
            if (diff < minDiff) {
                minDiff = diff
            }
        }

        println(minDiff)
    }