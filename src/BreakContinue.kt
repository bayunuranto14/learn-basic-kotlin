//Break -> untuk menghentikan seluruh perulangan yang berjalan
//Continue --> untuk menghentikan perulangan yang berjalan, dan langsung melanjutkan ke perulangan selanjutnya

fun main() {
    var i = 0
    while (true) {
        println("Hello ke $i")
        i++
        if (i > 1000) {
            break //Perulangan akan berhenti
        }
    }
    for (i in 1..1000) {
        if (i % 2 ==0) {
            continue
        }
        println("Angka ke $i")
    }
}