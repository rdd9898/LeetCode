package daily_practice.may_2023.day08.offer_ii_016;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void lengthOfLongestSubstring() {
        String s = "abcabcbb";
        Solution solution = new Solution();
        int ans = solution.lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
}