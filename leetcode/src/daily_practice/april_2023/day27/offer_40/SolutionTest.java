package daily_practice.april_2023.day27.offer_40;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findNthDigit() {
        int n = 1000000000;
        Solution solution = new Solution();
        int ans = solution.findNthDigit(n);
        System.out.println(ans);
    }
}