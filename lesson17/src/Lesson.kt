fun main(){
    println(getMax(4, 7))
    println(getMax(11.2, 11.0))
    println(getMax(4, 7, 9))
    sayHello()
    sayHello("Dart", 3)
    printInts(1,2,3,11)

}

fun printInts(vararg ints: Int){
    for (i in ints) println(i)
}

fun getMax(num1: Int, num2:Int) = if (num1 > num2) num1 else num2

fun getMax(num1: Double, num2: Double): Double{
    return if (num1 > num2) num1 else num2
}
fun getMax(num1: Int, num2: Int, num3: Int): Int{
    return when{
        num1 > num2 && num1 > num3 -> num1
        num2 > num1 && num2 > num3 -> num2
        else -> num3
    }
}

fun sayHello(name: String = "Kotlin", reps: Int = 2){
    var counter = reps
    while (counter > 0){
        println("Hello $name. Where are you?")
        counter--
    }
}

