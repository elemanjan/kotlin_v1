fun main(){


    val names = arrayListOf("Kotlin", "Java", "Dart")

    for (i in 0 until names.size){
        println(names[i])
    }
    println("-------------------")
    for (name in names){
        println(name)
    }

    println("-------------------")

    names.forEachIndexed{index, name ->
        println("$index $name")
    }

    println("-------------------")

    for (i in 0..10){
        println(i)
        if (i == 5) continue
    }

    println("-------------------")
    var j = 0
    while (j < 5){
        println(j)
        j++
    }

    println("-------------------")

    val k = 5
    do {
        println(5)
    }
    while (k < 5)
}