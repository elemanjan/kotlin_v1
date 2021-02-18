fun main(){
    println("enter number of month:")
    val numMonth = readLine()!!.toInt()

    when(numMonth){
        1 -> println("31")
        2 -> println("28")
        3 -> println("31")
        4 -> println("30")
        5 -> println("31")
        6 -> println("30")
        7 -> println("31")
        8 -> println("31")
        9 -> println("30")
        10 -> println("31")
        11 -> println("30")
        12 -> println("31")
        else -> println("invalid num of month")
    }
}