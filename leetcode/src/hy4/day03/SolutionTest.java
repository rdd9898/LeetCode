package hy4.day03;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void Test() {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        Solution solution = new Solution();
        String ans = solution.mostCommonWord(paragraph, banned);
        System.out.println(ans);
    }

}