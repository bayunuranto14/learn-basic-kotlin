//Recursive Functopn-> Function yang memanggil function dirinya sendiri
//Contoh : Factorial.
//10*9*8*7*6*5*4*3*2*1 = //output : 3628800

fun main() {
    fun factorialLoop(value: Int):Int {
        var result = 1;
        for(i in value downTo 1) {
            result *= i
        }
        return result
    }

    fun factorialRecursive(value:Int):Int {
        return when (value) {
            1 -> 1
            else -> value * factorialRecursive(value -1)
        }
    }
    println(factorialRecursive(10))

    println(factorialLoop(10))
}