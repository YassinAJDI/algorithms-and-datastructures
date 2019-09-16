package easy

import java.util.*

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    val lightX = input.nextInt() // the X position of the light of power
    val lightY = input.nextInt() // the Y position of the light of power
    val initialTx = input.nextInt() // Thor's starting X position
    val initialTy = input.nextInt() // Thor's starting Y position
    var currentX = initialTx
    var currentY = initialTy

    // game loop
    while (true) {
        val remainingTurns = input.nextInt() // The remaining amount of turns Thor can move. Do not remove this line.

        var horizontal = ""
        var vertical = ""
        // horizontal
        if (currentX < lightX) { // east
            currentX++
            horizontal = "E"
        } else if (currentX > lightX) { // west
            currentX--
            horizontal = "W"
        }
        // vertical
        if (currentY < lightY) { // south
            currentY++
            vertical = "S"
        } else if (currentY > lightY) { // north
            currentY--
            vertical = "N"
        }

        // A single line providing the move to be made: N NE E SE S SW W or NW
        println(vertical + horizontal)
    }
}