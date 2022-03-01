//Anonymous Function
//Anonymous function mirip seperti lambda yang membedakan cara membuatnya. //fun

fun main() {
    val anonymousUpper = fun(value:String): String{
        if(value.isBlank()) {
            return "Up"
        }else {
            return value.toUpperCase()
        }


    }
    println(anonymousUpper("Bayu"))
    println(anonymousUpper(""))

}