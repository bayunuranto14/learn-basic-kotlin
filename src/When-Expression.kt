//When Expression : Bahasa lain : Switch Case
fun main() {

    val nilai = 'D'
    when (nilai) {
        'A' -> println("Sangat Bagus")
        'B' -> println("Bagus")
        'C' -> println("SangatCukup")
        'D' -> println("Cukup")
        else -> println("Gagal")
    }
    //Grouping
    when(nilai) {
        'A', 'B', 'C','D' -> {
            println("Lulus")
        }
        else -> {
            println("Tidak Lulus")
        }
    }
    val name = "Bayu"
    when (name) {
        is String -> println("Name is String")
        !is String -> println("Name is Not String")

    }

    //When secara simple
    val nilaiUjian = 90
    when {
        nilaiUjian > 90 -> println("Amazing")
        nilaiUjian > 80 -> println("Good Job")
        nilaiUjian > 60 -> println("Not Bad")
        else -> println("Mengulang tahun depan")
    }
}