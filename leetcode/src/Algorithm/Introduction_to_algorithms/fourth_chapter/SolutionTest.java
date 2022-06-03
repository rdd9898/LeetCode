package Algorithm.Introduction_to_algorithms.fourth_chapter;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findMaximumSubarray() {
        int[] array = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
        int low = 0;
        int high = array.length - 1;
        Solution solution = new Solution();
//        int[] answers = solution.findMaximumSubarray(array, low, high);
        int[] answers = solution.iterativeFindMaximumSubarray(array);
        for (int answer : answers) {
            System.out.println(answer);
        }
    }
}