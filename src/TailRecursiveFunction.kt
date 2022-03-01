//Tail Recursive Function
//tumpukan function, jika tumpukan function terlalu banyak akan menyebabkan stack overflow
//stack overflow error:
//  factorial(5)
//  factorial(5) ==> 5 * factorial (4)
//  factorial(5) ==> 5 * factorial (4) ==> 4* factorial (3)
//  factorial(5) ==> 5 * factorial (4) ==> 4* factorial (3) ==> 3 * factorial (2)
//  factorial(5) ==> 5 * factorial (4) ==> 4* factorial (3) ==> 3 * factorial (2) ==> 2*factorial (1)
//  factorial(5) ==> 5 * factorial (4) ==> 4* factorial (3) ==> 3 * factorial (2) ==> 2*factorial (1) ==> 1
//hasil 1


//permasalahan ini bisa diakali dengan Tail recursive function
//function yang dibuat , menjadi looping biasa ketika dijalankan
//hanya memanggil dirinya sendiri

//tambahkan tailrec

fun main() {
    tailrec fun display(value: Int) {
        println("Recursive $value")
        if (value > 0) {
            display(value -1)
        }
    }
    display(10000)
}


//Tail recursive Factorial
//factorialTail(5,1)
//factorialTail(4,5)
//factorialTail(3,20)
//factorialTail(2,60)
//factorialTail(1,120)
//Output 120