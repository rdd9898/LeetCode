package daily_practice.april_2023.day27.offer_14_ii;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void cuttingRope() {
        Solution solution = new Solution();
        for (int i = 2; i <= 10; i++) {
            System.out.println(solution.cuttingRope(i));
        }
    }
}