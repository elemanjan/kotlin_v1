//package Homework19

fun main() {
    val person1 = Employee("Eleman", "Zhanybekov", 27, 4)
    val person2 = person1.copy(name = "Elon")
    println(person1.toString())
    println(person2.toString())
    println(person1.hashCode())
    println(person2.hashCode())
    println(person1 == person2)
}


data class Employee(
    val name: String,
    val surname: String,
    val age: Int,
    val experince: Int
){

}