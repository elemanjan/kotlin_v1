fun main() {
    var n = readLine()!!.toInt()
    var result = 0
    var digit = 0
    while (n > 0) {
        digit = n % 10
        result += 1
        n /= 10
    }

    println(result)
}