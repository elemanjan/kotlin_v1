import kotlin.math.*
fun main(){

    val x = 6.0
    val y = 3.0
    val r = 5.0
    var h = sqrt(x.pow(2) + y.pow(2))
    if (h > r)
        print("точка находится за пределами круга")
    else
        print("точка принадлежит кругу")


}