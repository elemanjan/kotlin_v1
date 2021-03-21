package Homework18

fun main(){
    val person = Person("Eleman", "Zhanybekov", 27)
    person.Greetings()

    val employee = Employee("Elon", "Musk", 49, 30)
    employee.Greetings()
}

open class Person(val name: String, val surname: String, val age: Int){

    open fun Greetings(){
        println("My name is $name")
    }
}

class Employee(name: String, surname: String, age: Int, val experince: Int): Person(name, surname, age){
    override fun Greetings(){
        println("My name is $name, $surname, i have $experince of experince.")
    }
}