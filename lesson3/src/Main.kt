fun main(){
    print("Enter 1st number: ")
    var a = readLine()
    print("Enter 2nd number: ")
    var b = readLine()
    var c = a!!.toInt() + b!!.toInt()
    print("Summ: $c")
}