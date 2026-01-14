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
    println("The diagonal is ${rect1.diagonal}")
    println("The area is ${rect1.area}")
}

interface Shape {
    val area: Float
    val circumference: Float
}

data class Rectangle
    (
    val width: Float,
    val height: Float
) : Shape {
    val diagonal = sqrt(width * width + height * height)
    override val area = width * height

    override val circumference: Float
        get() = 2 * (width + height)

}

data class Circle(val radius: Float) : Shape {
    override val area: Float
        get() = Math.PI.toFloat() * radius * radius
    override val circumference: Float
        get() = 2 * Math.PI.toFloat() * radius
}