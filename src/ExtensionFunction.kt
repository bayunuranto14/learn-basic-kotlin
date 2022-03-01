//Extension Function
//Menambahkan function pada tipe data yang sudah ada
//Menambahkan Extension Function
//Metaprogramming <- Bahasa lain

//Diawali tipe data . function
//Mengikuti kata This

fun String.hello():String {
    return "Hello $this"
}

fun String.printHello():Unit = println("Hello $this")
//single expression

//fun String.hello():String = "Hello $this"

fun main() {
    val name: String = "Bayu"
    val hello: String = name.hello()

    println(hello)
    name.printHello()
    "Nuranto".printHello()
}