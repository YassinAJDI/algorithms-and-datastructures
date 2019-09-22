package insertion_sort

fun main() {
    val array = intArrayOf(12, 11, 13, 5, 6)
    InsertionSort().sort(array)
    println(array.contentToString())
}