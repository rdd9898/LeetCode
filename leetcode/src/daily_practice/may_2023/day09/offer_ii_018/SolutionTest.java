package daily_practice.may_2023.day09.offer_ii_018;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isPalindrome() {
        String s = "A man, a plan, a canal: Panama";
        Solution solution = new Solution();
        boolean ans = solution.isPalindrome(s);
        System.out.println(ans);
    }
}