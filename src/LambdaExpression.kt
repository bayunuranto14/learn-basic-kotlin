//Lambda Expression -> function yang tidak memiliki nama
// bisa dimasukkan ke variable, array, function


//It -> parameter

fun toUpper(value: String): String = value.toUpperCase()

fun main() {
    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
    val result = "$firstName $lastName"
        result
    }
    val result = contohLambda("Bayu", "Budi")
    println(result)

    //Menggunakan it
    val hallo: (String) -> String = {
        "Hallo $it"
    }
    println(hallo("Bayu"))

    //Method Reference : membuat lamda dari referensi yang sudah ada
    //menggunakan (::)
    val toUpperCase: (String) -> String = ::toUpper
    println(toUpperCase("Bayu Nuranto"))
}