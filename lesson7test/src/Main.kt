fun main(){

    val a = 15

    val message =
        if (a % 2 == 0)
            println("\"a\" is even")
        else if (a % 2 != 0 && a % 5 == 0)
            println("\"a\" is divisible by 5")
        else
            println("\"a\" is not even and not divisible by 5")
}