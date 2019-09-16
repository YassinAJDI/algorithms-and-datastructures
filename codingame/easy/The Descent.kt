package easy

import java.util.*

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 *
 * https://www.codingame.com/ide/puzzle/the-descent
 **/
fun main(args : Array<String>) {
    val input = Scanner(System.`in`)

    // game loop
    while (true) {
        var indexM = 0
        var maxH = 0
        for (i in 0 until 8) {
            val mountainH = input.nextInt() // represents the height of one mountain.
            if (mountainH > maxH){
                maxH = mountainH
                indexM = i
            }
        }
        println(indexM) // The index of the mountain to fire on.
    }
}