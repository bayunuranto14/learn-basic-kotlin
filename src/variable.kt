//Variable String
//Variable adalah tempat untuk menyimpan data
//Var -> Membuat variable mutable (bisa diubah)
//val -> Membuat variable immutable (tidak bisa diubah)

//Deklarasi Variablee
//(val / var ) namaVariable: TipeData = data
//tipe data opsional
//Direkomendasikan immutable {lebih aman, terprediksi}


//Nullable = Wajib diisi datanya (representasikan jadi 0)
//Nullable = bisa meenggunakan ?(tanda tanya) setelah tipe datanya.


//Variable Constant - > untuk keperluan global, bisa diakses manapun, biasanya UPPER_CASE
//Wajib menggunakan Val

const val APP = "Kotlin"
const val VersionJava = "Jdk 13"

fun main() {
    val firstName:String = "Bayu"
    val age = 30;

    println(firstName)
//    println(firstName.length) //code salah
    println(firstName?.length) //Code benar
    println(age)

    var name: String? = null
    name = "Bayu"
    println(name)
    println(name?.length)

    //constant
    println("$APP : $VersionJava")

}
