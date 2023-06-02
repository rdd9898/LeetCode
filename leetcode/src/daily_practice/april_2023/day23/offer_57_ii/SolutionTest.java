package daily_practice.april_2023.day23.offer_57_ii;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void findContinuousSequence() {
        int target = 9;
        Solution solution = new Solution();
        int[][] ans = solution.findContinuousSequence(target);
        for (int[] an : ans) {
            for (int i : an) {
                System.out.println(i);
            }
        }
    }
}