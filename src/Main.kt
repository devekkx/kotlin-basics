import kotlin.math.sqrt

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /*
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
     **/


    val rect1 = Rectangle(5f, 10f)

    println(rect1.width)
    println(rect1.height)

    println(greetMe(Country.GHANA))

    val stringList = listOf("Kotlin", "Java", "JavaScript", "Python", "C++", "C#")
    val integers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val filteredStrings = stringList.myFilter { currentString ->
        currentString.length > 3
    }

    val filteredIntegers = integers.myFilter { currentInt ->
        currentInt > 5
    }

    println("Filtered Strings: $filteredStrings")
    println("Filtered Integers: $filteredIntegers")

}

//interface Shape {
//    val area: Float
//    val circumference: Float
//}

abstract class Shape {
    abstract val area: Float
    abstract val circumference: Float

    var count = 0

    fun inc() {
        count++
    }
}

sealed interface Shape1 {
    val area: Float
    val circumference: Float
}

enum class Country {
    USA, CANADA, MEXICO, GHANA, GERMANY
}

fun greetMe(country: Country): String {
    return when (country) {
        Country.USA -> "Hello!"
        Country.CANADA -> "Bonjour!"
        Country.MEXICO -> "Hola!"
        Country.GHANA -> "Woezor!"
        Country.GERMANY -> "Guten Tag!"
    }
}

fun makeNetworkCall(): Result<Int, String> {
    return Result.Failure("error occurred")
}

data class Rectangle
    (
    val width: Float,
    val height: Float
) : Shape() {
    val diagonal = sqrt(width * width + height * height)
    override val area = width * height

    override val circumference: Float
        get() = 2 * (width + height)

}

data class Circle(val radius: Float) : Shape() {
    override val area: Float
        get() = Math.PI.toFloat() * radius * radius
    override val circumference: Float
        get() = 2 * Math.PI.toFloat() * radius
}

fun <T> List<T>.myFilter(predicate: (T) -> Boolean): List<T> {
    val result = mutableListOf<T>()
    for (item in this) {
        if (predicate(item)) {
            result.add(item)
        }
    }
    return result.toList()
}

sealed interface Result<out D, out E> {
    data class Success<D>(val data: D) : Result<D, Nothing>
    data class Failure<E>(val error: E) : Result<Nothing, E>
}