fun main(){

    val a = arrayOf(1, 2, 3)
    val b = arrayOf(4, 5, 6)
    var sum = 0
    for (i in 0..a.size-1)
    {
        sum += a[i]
    }
    for (i in 0..b.size-1)
    {
        sum += b[i]
    }

    println(sum)
}