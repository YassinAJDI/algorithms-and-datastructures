package java;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrderMatrixI {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        int rows = A.size(); // rows
        int cols = A.get(0).size(); // columns
        int top = 0, bottom = rows - 1, right = cols - 1, left = 0, dir = 0;
        ArrayList<Integer> steps = new ArrayList<>();
        while (top <= bottom && left <= right) {
            if (dir == 0) { // go from left to right
                for (int i = left; i <= right; i++) {
                    steps.add(A.get(top).get(i));
                }
                top++;
            } else if (dir == 1) { // go from top to bottom
                for (int i = top; i <= bottom; i++) {
                    steps.add(A.get(i).get(right));
                }
                right--;
            } else if (dir == 2) { // go from right to left
                for (int i = right; i >= left; i--) {
                    steps.add(A.get(bottom).get(i));
                }
                bottom--;
            } else if (dir == 3) { // go from bottom to top
                for (int i = bottom; i >= top; i--) {
                    steps.add(A.get(i).get(left));
                }
                left++;
            }
            dir = (dir + 1) % 4;
        }
        return steps;
    }
}
