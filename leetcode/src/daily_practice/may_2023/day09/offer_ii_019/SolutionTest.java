package daily_practice.may_2023.day09.offer_ii_019;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void validPalindrome() {
        String s = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        Solution solution = new Solution();
        boolean ans = solution.validPalindrome(s);
        System.out.println(ans);
    }
}