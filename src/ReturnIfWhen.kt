//Return If
fun main() {
    fun Hello(name:String = ""): String{
        //Return When
        when(name){
            "" -> return "Hello Guys"
            else -> return "Hello $name"
        }
        //Return If
//        return if (name =="") {
//            "Hello Guys"
//        }else {
//            "Hello $name"
//        }
    }
    println(Hello())
    println(Hello("Bayu"))
}
