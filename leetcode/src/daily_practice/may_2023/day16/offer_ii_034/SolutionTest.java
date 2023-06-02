package daily_practice.may_2023.day16.offer_ii_034;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isAlienSorted() {
        String[] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        Solution solution = new Solution();
        boolean ans = solution.isAlienSorted(words, order);
        System.out.println(ans);
    }
}