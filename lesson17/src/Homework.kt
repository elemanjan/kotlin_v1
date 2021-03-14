import kotlin.math.pow

fun main(){
    println(calcDeposit(50000.0, 10.0))

}

fun calcDeposit(deposit: Double, p: Double): Double{
    val sum = deposit * (1 + p / 100).pow(5)
    return String.format("%.1f", deposit * (1 + p / 100).pow(5)).toDouble()
}
