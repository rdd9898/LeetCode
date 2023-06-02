package daily_practice.may_2023.day05.offer_ii_005;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxProduct() {
        String[] words = {"abcw","baz","foo","bar","fxyz","abcdef"};
        Solution solution = new Solution();
        int ans = solution.maxProduct(words);
        System.out.println(ans);
    }
}