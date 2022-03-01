fun main() {
    var age: Int = 200

    var sample: Float = 10.10F
    var hexaDesimal: Int = 0xFF //bilangan Hexadesimal
    var binaryLiteral: Int = 0b10101010001 //bilangan binary
    var price: Long = 9_000_000_000L
    //Conversion
    var priceInt: Int = price.toInt() //kena overflow karena lebih dari 2M
    var doubleBinary:Double = binaryLiteral.toDouble()

    println(age)
    println(sample)
    println(hexaDesimal)
    println(binaryLiteral)
    println(price)
    println(priceInt)
    println(doubleBinary)
}
//Float -> ditambah F
//Long -> ditambah L
//Underscore : untuk lebih mudah dibaca (separator)
