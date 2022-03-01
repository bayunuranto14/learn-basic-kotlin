//Function Default Argument
//Paremeter yang tidak wajib diisi
fun main() {
    halo("Bayu")
    halo("Bayu", "Nuranto")
    halo("Afif")
    halo("Arif")
}
fun halo(firstName:String, lastName:String? = null) {
    if (lastName == null) {
        println("Halo $firstName")
    }else {
        println("Halo $firstName $lastName")
    }
}