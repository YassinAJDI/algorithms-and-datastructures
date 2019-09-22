package bubble_sort

fun main() {
    val array = intArrayOf(2, 1, 4, 0)
    BubbleSort().sort(array)
    println(array.contentToString())
}