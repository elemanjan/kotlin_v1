import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    println("Введите коэффициенты для квадратного уравнения (ax^2 + bx + c = 0):")
    println("Введите число для a: ")
    var a = readLine()?.toDouble()
//    a = a.toDouble()
    println("Введите число для b: ")
    val b = readLine()?.toDouble()
    println("Введите число для c: ")
    val c = readLine()?.toDouble()
    var x1 = 0.0
    var x2 = 0.0
    var x = 0.0
    var d = b?.pow(2)!! - 4 * a!! * c!!
    if (d > 0){
        x1 = (-b + sqrt(d)) / (2 * a)
        x2 = (-b - sqrt(d)) / (2 * a)
        println("x1 = ${x1} \nx2 = ${x2}")
    }
    else if (d.equals(0)){
        x = -b / (2 * a)
        println("x = ${x}")
    }
    else{
        print("Корней нет")
    }
}