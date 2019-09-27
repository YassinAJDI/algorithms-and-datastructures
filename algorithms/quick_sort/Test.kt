package quick_sort

fun main() {
    val array = intArrayOf(9, 7, 5, 11, 12, 2, 14, 3, 10, 6)
    QuickSort.sort(array)
    println(array.contentToString())
}