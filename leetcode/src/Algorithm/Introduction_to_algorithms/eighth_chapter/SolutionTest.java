package Algorithm.Introduction_to_algorithms.eighth_chapter;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void countingSort() {

        int[] inputArray = {2, 5, 3, 0, 2, 3, 0, 3};
        int[] outputArray = new int[inputArray.length];
        int k = 5;
        Solution solution = new Solution();
        solution.countingSort(inputArray, outputArray, k);
        int i = 1;

    }
}