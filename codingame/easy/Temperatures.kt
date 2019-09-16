package easy

import java.util.*
import kotlin.math.absoluteValue

/**
 * https://www.codingame.com/ide/puzzle/temperatures
 **/
fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val n = input.nextInt() // the number of temperatures to analyse
    val temps = mutableListOf<Int>()
    for (i in 0 until n) {
        val t = input.nextInt() // a temperature expressed as an integer ranging from -273 to 5526
        temps.add(t)
    }
    println( temps.sortedDescending().minBy { it.absoluteValue } ?: 0)
}