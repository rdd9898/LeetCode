package daily_practice.may_2023.day18.question_1073;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void addNegabinary() {
        int[] arr1 = {1, 1, 1, 1, 1};
        int[] arr2 = {1, 0, 1};
        Solution solution = new Solution();
        int[] ans = solution.addNegabinary(arr1, arr2);
        for (int an : ans) {
            System.out.println(an);
        }
    }
}