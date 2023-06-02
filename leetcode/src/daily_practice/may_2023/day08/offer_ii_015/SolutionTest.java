package daily_practice.may_2023.day08.offer_ii_015;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findAnagrams() {

        String s = "cbaebabacd";
        String p = "abc";
        Solution solution = new Solution();
        List<Integer> ans = solution.findAnagrams(s, p);
        for (Integer an : ans) {
            System.out.println(an);
        }

    }
}