fun main() {
    var array = arrayOf("Bayu", "Afif", "Nuranto","Budi","Anton")

    var total = 0;

    for (name in array) {
        println(name)
        total++
    }
    println("Total perulangan = $total")

    val ukuranArray = array.size - 1
    //Perulangan For Range
    for (i in 0..ukuranArray) {
        println("Array $i = ${array.get(i)}")
    }

}


