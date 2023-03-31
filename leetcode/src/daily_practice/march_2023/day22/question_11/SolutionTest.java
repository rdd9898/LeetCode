package daily_practice.march_2023.day22.question_11;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxArea() {

        int[] height = {1,8,6,2,5,4,8,3,7};
        Solution solution = new Solution();
        int ans = solution.maxArea(height);
        System.out.println(ans);

    }
}