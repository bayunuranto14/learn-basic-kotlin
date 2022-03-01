//Function Scope -> ruang lingkup dimana sebuah function bisa diakses
//Scope : Jangkauan

fun main() {
    fun helloWorld(name:String):Unit {
        println("Hello $name")
    }

    fun Hello(name:String):Unit {
        println("Hello $name")
    }

    Hello("Bayu")
    helloWorld("World")
}