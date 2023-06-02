package daily_practice.may_2023.day09.offer_ii_017;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minWindow() {
        String s = "aaaaaaaaaaaabbbbbcdd", t = "abcdd";
        Solution solution = new Solution();
        String ans = solution.minWindow(s, t);
        System.out.println(ans);
    }
}