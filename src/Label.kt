//Label -> Penanda
//diikuti dengan kata @
//pmenampilkan semua perkalian
//kegunaan -> untuk break, continue dan return
//untuk menentukan label berhenti

fun labelBreak() {
    loopI@ for (i in 1 ..10) {
        loopJ@ for (j in 1..10) {
            if(i > 5) {
                break@loopI //menentukan berenti nya dimana
            }
            println("$i x $j = ${i * j}")

        }
    }
}

fun labelContinue() {
    loopI@ for (i in 1 ..10) {
        loopJ@ for (j in 1..10) {
            if(j == 5) {
                continue@loopI//menentukan berenti nya dimana
            }
            println("$i x $j = ${i * j}")

        }
    }
}

fun test(name:String, operation: (String) -> Unit):Unit = operation(name)

fun main() {
   test(""){
       if(it == "Bayu"){
           return@test
       }else {
            println("Bayu")
       }
   }
}