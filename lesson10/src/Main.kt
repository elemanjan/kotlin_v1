fun main(){
    val myMap = hashMapOf<String, String>()
//    val myMap = linkedMapOf<String, String>()

    myMap.put("password", "123456")
    myMap.put("username", "elemanz")
    myMap.put("name", "Eleman")
    myMap.put("name", "Noman")

//    println(myMap.get("name"))
    println(myMap.entries)

    myMap.remove("password")

    println(myMap.entries)

    println("--------------")

    val mySet = HashSet<Int>()
//    mySet.add(1)
//    mySet.add(1)
//    mySet.add(3)
//    mySet.add(2)
//    mySet.add(4)

    val myList = arrayListOf(1,2,3,1,2,3,4,4,5,1)

    mySet.addAll(myList)
    println(mySet)
}