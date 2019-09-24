package merge_sort;

public class MergeSort {

    public void sort(int[] array) {
        int[] aux = new int[array.length];
        sort(array, aux, 0, array.length - 1);
    }

    private void sort(int[] array, int[] aux, int start, int end) {
        // Base case. A list of zero or one elements is sorted, by definition.
        if (end <= start) return;

        // Get the index of the element which is in the middle
        int mid = start + (end - start) / 2;
        sort(array, aux, start, mid); // sort the left half
        sort(array, aux, mid + 1, end); // sort the right half
        // merge the resulting runs into original array
        merge(array, aux, start, mid, end);
    }

    private void merge(int[] array, int[] aux, int start, int mid, int end) {
        // copy to aux[]
        for (int k = start; k <= end; k++) {
            aux[k] = array[k];
        }

        // merge back into original array
        int i = start, j = mid + 1;
        for (int k = start; k <= end; k++) {
            if (j > end) { // right pointer has reached the limit
                array[k] = aux[i++];
            } else if (i > mid) { // left pointer has reached the limit
                array[k] = aux[j++];
            } else if (aux[i] < aux[j]) {
                array[k] = aux[i++];
            } else {
                array[k] = aux[j++];
            }
        }
    }
}
