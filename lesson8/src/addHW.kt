fun main(){

    val arr = arrayOf(5, -3, 15, 61, 29, 10, -2 ,7)
    var max = 0

    for (i in 0..arr.size-1)
    {
        if (arr[i] > max)
            max = arr[i]
    }

    println(max)
}