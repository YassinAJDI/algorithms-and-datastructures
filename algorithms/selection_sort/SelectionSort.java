package selection_sort;

public class SelectionSort {
    public void sort(int[] array) {
        int tmp, minIndex, n = array.length;
        for (int i = 0; i < n - 1; i++) {
            minIndex = i; // index of min value
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                tmp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = tmp;
            }
        }
    }
}
