//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//   arrays()
//loops()

//    Lambda functions

// println("Enter a string: ")
    val input = readln()
    val lettersOnly = input.filter {
        it.isLetter()
    }
//
//    println(lettersOnly)

//    val evenNumbers =  (1..20).filter {
//        it % 2 == 0
//    }
//
//    println(evenNumbers)

//    Custom lambda

    fun String.myFilter(predicate: (Char) -> Boolean): String {
     return buildString {
         for (char in this@myFilter) {
                if (predicate(char)) {
                    append(char)
                }
            }
     }
    }
}