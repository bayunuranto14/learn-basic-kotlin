//Single Expression Function
//Deklarasi Function hanya 1 baris kode

fun double(a:Int):Int = a * 2
fun halo(name:String):Unit = println("Hi $name")

fun main() {
    val result = double(10)
    println(result)
    halo("Bayu")
}
