//Array = (Larik) tipe data yang berisi kumpulan data
//keyword : Array
//Index = Data yang dimasukkan Array diakses oleeh index {0, 1, 2}


//           Operasi Array =
// size: untuk mendapatkan panjang array,
// get(index) : mendapat posisi index,
// [index] : mendapat  posisi index,
// set(index, value) : mengubah data di posisi index
// [index] = value : mengubah data di posisi index

//null akan error - karena tipe data string
//ukuran array sudah fix tidak bisa diubah
//Array Nullable : ditambah (?)
//Array tidak dinamis

fun main() {
    val members :Array<String> = arrayOf("Bayu","Budi","Eko")
    val values: Array<Byte> = arrayOf(10, 85, 80)

    members.set(0, "Rudi")
    members[0] = "Rudi"
    println(members[0])

    println(values[0])
    println(values[1])
    println(values[2])

    val names: Array<String?> = arrayOfNulls(4)
    names[0] = "Bayu"
    names[1] = "Null"
    names[2] = "Bayu"
    names[3] = "Null"
    println(names.size)
}