//Operator
//Augmented Assignment ====> a+= 10, a-= 10 , a*= 10, a/= 10, a%= 10
//Unary Operator ->  ++ : (a= a+1), -- : (a = a-1), - (negative), + (positive), | (boolean), ! (not)

fun main() {
    val result = 10.0/3 //float
    println(result)

    var result1: Int = 10/3
    println(result1)

    var result2: Int = 10 + 10 / 2;
    println(result2)

    var total: Int = 0;
    val barang1 = 100;
    total += barang1
    val barang2 = 200;
    total += barang2
    val barang3 = 300
    total += barang3

    println(total)

    total++ // total + 1
    total++ // total + 1
    total++ // total + 1

    println(total)

    val suhu = -5
    println(suhu)

    val sehat = true
    println(!sehat)
}