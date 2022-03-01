//Infix Notation -> operasi yang biasa dilakukan di operasi matematika
//function tidak wajib menggunakan tanda .(titik)
//Syarat -> Harus sebagai function extension, harus memiliki 1 parameter, tidak boleh varargs dan tidak boleh memiliki nilai default

infix fun String.to(type:String):String {
    if (type == "UP") {
        return this.toUpperCase()
    }else {
        return this.toLowerCase()
    }
}

fun main() {
   var result:String = "Bayu" to "UP"
    println(result)
}