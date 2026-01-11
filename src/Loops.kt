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
    val input = readln()

//    Build reversal string
    val finalString  = buildString {
        for (i in input.lastIndex downTo 0) {
            append(input[i])
        }
    }

    println(finalString)
}
