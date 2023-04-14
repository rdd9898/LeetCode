package daily_practice.april_2023.day14.interview_13;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void movingCount() {
        Solution solution = new Solution();
        int ans = solution.movingCount(2, 3, 1);
        System.out.println(ans);
    }
}