fun main() {
    var n = readln().toInt();
    var kq = 1;
    while (n > 0) {
        kq *= n;
        n--;
    }
    println(kq);
}