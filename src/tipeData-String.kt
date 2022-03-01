//String -> kumpulan karakter lebih dari 1 (teks)
//di Kotlin kata kunci String
//Function Trim Margin -> menggabungkan beberapa line menjadi satu
fun main() {
  var firstName: String = "Bayu"
  var lastName: String = "Afif Nuranto"
  //String Template : secara otomatis mengakses data dari luar teksn string
  // $ --> variable lain
  var fullName: String = "$firstName $lastName"

  var desc: String = "$fullName length = ${fullName.length}" //Total Character dari variable diatas
  var address: String = """
    >Jalan Rawa Jaya, RT 02 RW 04,
    >Pondok Kopi,
    >Jakarta Timur
    
    """.trimMargin(">")
  println(fullName)

  println(firstName)
  println(lastName)
  println(address)
  println(desc + "" + "character")
}