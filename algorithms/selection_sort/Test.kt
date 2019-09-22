package selection_sort

fun main() {
    val array = intArrayOf(5, 2, 6, 7, 2, 1, 0, 3)
    SelectionSort().sort(array)
    println(array.contentToString())
}