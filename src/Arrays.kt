fun arrays() {
println("Enter the index of the favorite number you want:")
  val input = readln()
val inputNumber = input.toIntOrNull()
val favoriteNumbers = intArrayOf(3, 7, 42, 100) + 212
if (inputNumber != null && inputNumber < favoriteNumbers.size) {
  println("Your favorite number is ${favoriteNumbers[inputNumber]}")
} else {
  println("That index doesn't exist in the array.")
}
}