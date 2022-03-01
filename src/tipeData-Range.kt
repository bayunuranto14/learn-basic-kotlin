//Range : berurutan -> bukan buat menampung data
//menggunakan .. (titik 2x)

// 0..10 : Range dari 0 sampai 10
//1..100 : Range dari 1 sampai 100

//operasi range
//count() ->Mendapatkan total data di range
//constain(value)) : Mengecek apakah terdapat value tersebut
//first : mendapatkan nilai awal
//last : mendapatkan nilai akhir
//step : mendapatkan nilai tiap kenaikan

//Range terbalik
//Down To

fun main() {
//    val range = 1 .. 100
    val range = 100 downTo 1 step 2

    println(range.count())
    println(range.contains(50))
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)



}