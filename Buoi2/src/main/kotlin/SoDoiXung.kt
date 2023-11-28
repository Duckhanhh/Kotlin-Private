fun isPalindrome(number: String): Boolean {
    val length = number.length
    val mid = length / 2

    for (i in 0 until mid) {
        if (number[i] != number[length - i - 1]) {
            return false
        }
    }

    return true
}

fun main() {
    val number = readln()

    if (isPalindrome(number)) {
        println("YES")
    } else {
        println("NO")
    }
}

