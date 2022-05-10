package daily_practice.may_2022.day10.question_1385;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findTheDistanceValue() {
        int[] arr1 = {-3,2,-5,7,1};
        int[] arr2 = {4};
        int d = 84;
        Solution solution = new Solution();
        int ans = solution.findTheDistanceValue(arr1, arr2, d);
        System.out.println(ans);
    }
}