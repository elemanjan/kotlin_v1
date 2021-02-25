fun main(){
    val itemCost = mapOf("Bread" to 50.0, "Apple" to 70.0, "Banana" to 60.0)
    val shoppingList = listOf("Bread", "Banana")
    var totalCost = 0.0

    for (myList in shoppingList){
        totalCost += itemCost[myList]!!
    }

    println(totalCost)

}