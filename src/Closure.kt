//Closure -> function, lambda atau anonymous function berinteraksi dengan data disekitarnya dalam scope yang sama


fun main() {
    var counter: Int = 0;
    val lambdaIncrement: () -> Unit = {
        println("Lambda Increment")
        counter++
    }

    val anonymousIncrement = fun() {
        println("Anonymous Function Increment")
        counter++
    }
    fun functionIncrement() {
        println("Function increment")
        counter++
    }
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)

}