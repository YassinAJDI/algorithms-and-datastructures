package easy

import java.util.*
import kotlin.math.abs
import kotlin.math.min

/**
 * https://www.codingame.com/ide/puzzle/horse-racing-duals
 **/
fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val N = input.nextInt()
    val horsesP = (0 until N).map { input.nextInt() }.sorted()
    var d = 10_000_000
    for (i in 0 until horsesP.size - 1) {
        d = min(abs(horsesP[i].minus(horsesP[i + 1])), d)
    }
    // Write an action using println()
    // To debug: System.err.println("Debug messages...");
    println(d)
}