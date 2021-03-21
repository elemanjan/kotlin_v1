package Homework19

fun main(){
    val book1 = Book("Jamila", "Ch.Aitmatov", 1958)
    val book2 = Book("Anna Karenina", "L.Tolstoy", 1877)
    val book3 = book1.copy(name = "When The Mountains Fall", edtion = 2006)

    println(book1.toString())
    println(book2.toString())
    println(book3.toString())

}

data class Book(
    val name: String,
    val author: String,
    val edtion: Int
){

}