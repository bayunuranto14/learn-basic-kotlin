import java.lang.instrument.ClassFileTransformer

//Higher Order Function
// function yang menggunakan function sebagai parameter atau mengembalikan function
//Lamda yang dijadikan parameter


fun main() {

    fun hello(name:String, transformer:(String) -> String):String {
        val nameTransformer = transformer(name)
        return "Hello $nameTransformer"
    }
    val lambdaUpper = {value:String -> value.toUpperCase()}
    println(hello("Bayu", lambdaUpper))

    println(hello("Bayu", {value:String -> value.toLowerCase()}))

    //Mudah dibaca (trailing lambda)
    val result = hello("Bayu") {value:String ->
        value.toLowerCase()
    }
    println(result)
}