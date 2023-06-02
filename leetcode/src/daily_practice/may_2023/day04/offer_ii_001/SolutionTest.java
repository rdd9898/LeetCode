package daily_practice.may_2023.day04.offer_ii_001;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void divide() {
        int a = -2147483648;
        int b = -1;
        Solution solution = new Solution();
        int ans = solution.divide(a, b);
        System.out.println(ans);
    }
}