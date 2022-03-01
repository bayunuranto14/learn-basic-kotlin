//Varargs -> datanya bisa lebih dari 1 input (Array)
//turunan function dari java

 //menggunakan tanda koma untuk menghubungkan
//varargs wajib di paling belakang

//Function varargs

fun hitungTotal(vararg values: Int):Int {
    var total = 0

    for(value in values) {
        total += value
    }
    return total
}

fun main() {
    val result = hitungTotal (10, 10,10, 10,10)
    println(result)
}