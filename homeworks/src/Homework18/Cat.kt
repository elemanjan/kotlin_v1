//package Homework18

fun main(){
    val cat = Cat("Pocha", 3, 50, 70)
    cat.greetings()
    cat.change()
}

class Cat(val name: String, val age: Int, var satiety: Int, var levelofWater: Int){

    open fun greetings(){
        println("Cats name: $name, age: $age, satiety of: $satiety, level of water: $levelofWater")
    }

    fun change(){
        levelofWater += 10
        satiety -= 10

        println("Cats name: $name, age: $age, satiety of: $satiety, level of water: $levelofWater")

    }
}