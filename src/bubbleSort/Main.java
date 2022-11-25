package bubbleSort;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = new int[]{2, 1, 4, 3, 6, 5, 8, 7, 9};
        solution.bubbleSort(array);
        for (int a : array) {
            System.out.print(a + " ");
        }

    }
}
