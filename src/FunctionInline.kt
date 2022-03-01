//Inline Function
//Kemampuan di kotlin yang mengubah Higher-Order Function menjadi Inline Function
// tidak perlu membuat objek berulang-ulang

//inline semua code nya akan di duplicate di bytecode
//No inline-> jika tidak ingin membuat inline, kasih code noinline

inline fun hallo(name:() -> String):String {
    return "Hello ${name()}"
}
inline fun address(address:() -> String):String {
    return "Address : ${address()}"
}

fun main() {
    println(hallo{"Bayu"});
    println(hallo{"Nuranto"});
    println(address{"Jakarta"})
}