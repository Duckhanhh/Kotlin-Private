fun main() {
    val n = readLine()!!.toInt()
    val labels = readLine()!!.split(" ")

    val labelCounts = mutableMapOf<String, Int>()
    var peopleWithGroup = 0

    for (label in labels) {
        if (labelCounts.containsKey(label)) {
            labelCounts[label] = labelCounts[label]!! + 1
        } else {
            labelCounts[label] = 1
        }
    }

    for (count in labelCounts.values) {
        if (count > 1) {
            peopleWithGroup += count
        }
    }

    println(peopleWithGroup)
}