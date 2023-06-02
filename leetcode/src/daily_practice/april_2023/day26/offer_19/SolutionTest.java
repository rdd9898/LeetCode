package daily_practice.april_2023.day26.offer_19;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isMatch() {
        String s = "mississippi";
        String p = "mis*is*ip*.";
        Solution solution = new Solution();
        boolean ans = solution.isMatch(s, p);
        System.out.println(ans);
    }
}