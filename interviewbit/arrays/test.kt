import java.util.ArrayList


fun main() {
    val listOfLists = ArrayList<ArrayList<Int>>()
    listOfLists.add(ArrayList(listOf(1, 2)))
    listOfLists.add(ArrayList(listOf(3, 4)))
    listOfLists.add(ArrayList(listOf(5, 6)))

    println(SpiralOrderMatrixI().spiralOrder(listOfLists))
}