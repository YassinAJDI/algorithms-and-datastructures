import java.util.ArrayList

class SpiralOrderMatrixI {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    fun spiralOrder(A: List<ArrayList<Int>>): ArrayList<Int> {
        val rows = A.size // rows
        val cols = A[0].size // columns
        var top = 0
        var bottom = rows - 1
        var right = cols - 1
        var left = 0
        var dir = 0
        val steps = ArrayList<Int>()
        while (top <= bottom && left <= right) {
            when (dir) {
                0 -> { // go from left to right
                    for (i in left..right) {
                        steps.add(A[top][i])
                    }
                    top++
                }
                1 -> { // go from top to bottom
                    for (i in top..bottom) {
                        steps.add(A[i][right])
                    }
                    right--
                }
                2 -> { // go from right to left
                    for (i in right downTo left) {
                        steps.add(A[bottom][i])
                    }
                    bottom--
                }
                3 -> { // go from bottom to top
                    for (i in bottom downTo top) {
                        steps.add(A[i][left])
                    }
                    left++
                }
            }
            dir = (dir + 1) % 4
        }
        return steps
    }
}