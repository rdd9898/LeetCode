package Algorithm.Introduction_to_algorithms.seventh_chapter;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void quickSort() {
        int[] arr = {5, 8, 7, 1, 3, 2, 6, 4};
        int p = 0;
        int r = arr.length - 1;
        Solution solution = new Solution();
        solution.hoareQuickSort(arr, p, r);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}