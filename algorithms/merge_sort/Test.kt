package merge_sort

fun main() {
    val array = intArrayOf(5, 2, 6, 7, 2, 1, 0, 3)
    MergeSort().sort(array)
    println(array.contentToString())
}