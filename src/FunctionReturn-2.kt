//Return-> Untuk mengembalikan data

fun main() {
    println(penjumlahan(10,2))
    println(bagi(10,2))
    println(perkalian(10,2))
}
fun penjumlahan(a:Int, b:Int):Int {
    val jumlah = a + b
    return jumlah
}
fun bagi(a:Int, b:Int):Int {
    val bagi = a / b
    return bagi
}
fun perkalian(a:Int, b:Int):Int {
    val perkalian = a * b
    return perkalian
}
