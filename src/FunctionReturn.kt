//Return -> Mengembalikan tipe data unit
//Unit
//Penulisan Unit tidak Wajib

fun main() {
    printHalo("Bayu")
}
fun printHalo(name:String?):Unit {
    if(name == null) {
        println("Halo Guys")
    }else {
        println("Halo $name")
    }
}