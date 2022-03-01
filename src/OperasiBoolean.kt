//Operasi Boolean
// && , || , !

fun main() {

    val nilaiUjian = 80
    val nilaiAbsen = 80
    val nilaiTambahan = 75
    val lulusUjian = nilaiUjian > 75
    val lulusAbsen = nilaiAbsen > 75
    val TambahanNilai = nilaiTambahan > 60

    val ApakahLulus = lulusUjian && lulusAbsen && TambahanNilai
    println(ApakahLulus)

}