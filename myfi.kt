import kotlin.math.*

const val Fingers: Int = 10
fun main(args: Array<String>) {
    //Constant
    println(Fingers)

    var A: Int = 30
    var B: Int = 40
    var C: Int

    //Average
    C =  (A + B) / 2
    println("The Average of A+B is " + C)

    A += 2
    println(A)

    A -= 10
    println(A)

    A *= 9
    println(A)

    A /= 4
    println(A)

    //shift to the right
    println( A shr 3)
    A += 1
    A *= 2

    //shift to the left
    println( A shl 4)
}