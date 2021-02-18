fun main(){
    val score = 101 


    when(score){
        in 90..100 -> print("5")
        in 70..89 -> print("4")
        in 50..69 -> print("3")
        in 30..49 -> print("2")
        in 0..29 -> print("1")
        else -> println("score is invalid")
    }
}