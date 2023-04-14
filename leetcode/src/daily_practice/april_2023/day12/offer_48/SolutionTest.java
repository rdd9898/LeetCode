package daily_practice.april_2023.day12.offer_48;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void lengthOfLongestSubstring() {
        String s = "abba";
        Solution2 solution = new Solution2();
        int ans = solution.lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
}