package quick_sort;

public class QuickSort {

    public static void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    /**
     * @param low:  Starting index
     * @param high: Ending index
     */
    private static void sort(int[] a, int low, int high) {
        if (high <= low) return;
        int j = partition(a, low, high);

        sort(a, low, j - 1);
        sort(a, j + 1, high);
    }

    /**
     * partition the subarray a[low..high] so that a[low..j-1] <= a[j] <= a[j+1..high]
     * and return the index j
     *
     * @return j pivot index
     */
    private static int partition(int[] a, int low, int high) {
        int i = low;
        int j = high + 1;
        int value = a[low];

        while (true) {

            // find item on low to swap
            while (a[++i] < value) {
                if (i == high) break;
            }

            // find item on high to swap
            while (a[--j] > value) {
                if (j == low) break;
            }

            // check if pointers cross
            if (i >= j) break;

            exch(a, i, j);
        }

        // put partitioning item v at a[j]
        exch(a, low, j);
        return j; // now, a[low .. j-1] <= a[j] <= a[j+1 .. high]
    }

    // exchange a[i] and a[j]
    private static void exch(int[] a, int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
