package Homework19

fun main() {
    val cat1 = Cats("Pocha", 3, 50, 70)
    val cat2 = cat1.copy(name = "Matt", levelofWater = 50)
    println(cat1.toString())
    println(cat2.toString())
    println(cat1.hashCode())
    println(cat2.hashCode())
    println(cat1 == cat2)
}

data class Cats(
    val name: String,
    val age: Int,
    val satiety: Int,
    val levelofWater: Int
) {

}