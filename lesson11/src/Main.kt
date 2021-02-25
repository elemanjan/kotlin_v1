fun main(){
    var myMap: HashMap<String, String>? = null
    val names = arrayOf("KG", "RU", "USA", "TR")
    val codes = arrayOf("+996", "+7", "+1", "+90")

    myMap = hashMapOf()
    for (i in names.indices){
        myMap.put(names[i], codes[i])
    }

    println(myMap["KG"])
}