fun main(){
    println("Введите 4 значное число: ")
    val a = readLine()
    if (a!![0].toInt() + a[1].toInt() == a[2].toInt() + a[3].toInt()){
        print(true)
    }
    else{
        print(false)
    }
}