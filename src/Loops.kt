fun loops() {
//   println("How many numbers will you enter?")
//   val amountOfNumbers = readln().toIntOrNull() ?: 0

    /*
   var sum = 0
   var i = 0
   while (i < amountOfNumbers) {
 println("Enter number ${i + 1}:")
      val num = readln().toIntOrNull() ?: continue
      sum += num
      i++
   }

   println("The total sum is $sum")
**/

    /*
val numbers = mutableListOf<Int>()
    for (i in 0..<amountOfNumbers) {
        println("Enter number ${i + 1}:")
        val num = readln().toIntOrNull() ?: continue
        numbers.add(num)
    }

    for (number in numbers) {
        println("You entered: $number")
    }

    **/

//    String loop
    println("Enter a string:")
    val input = readln().toInt()

//    Build reversal string
//    val reversed = reversedString(input)
//    println(reversed)
//    println(reversedString("racecar"))
//}
//
//fun reversedString(stringToReverse: String): String {
//   val finalString = buildString {
//        for (i in stringToReverse.lastIndex downTo 0) {
//            append(stringToReverse[i])
//        }
//    }
//return finalString
//}


    //Extension function version
//
//    val reversed = input.reversed()
//
//    println(reversed)
//
//    fun String.reversed(): String {
//        val finalString = buildString {
//            for (i in lastIndex downTo 0) {
//                append(this[i])
//            }
//        }
//        return finalString
//    }


    // Function overloading

    fun Int.reversed(): Int {
        return this.toString().reversed().toInt()
    }
}