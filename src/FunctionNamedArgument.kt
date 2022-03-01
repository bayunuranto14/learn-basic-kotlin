//Function Named Argument
//Named Argument -> menyebutkan nama parameter saat memanggil function

fun main() {
    fullName(firstName = "Bayu", lastName="Nuranto", middleName = "Afif")
}
fun fullName(firstName:String, middleName:String, lastName:String) {
    println("Halo $firstName $middleName $lastName")
}