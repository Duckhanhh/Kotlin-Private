fun main() {
    var s = readLine()!!.toInt()

    var numBags = 0

    if (s >= 5) {
        numBags += s / 5
        s %= 5
    }

    if (s >= 2) {
        numBags += s / 2
        s %= 2
    }

    numBags += s

    println(numBags)
}