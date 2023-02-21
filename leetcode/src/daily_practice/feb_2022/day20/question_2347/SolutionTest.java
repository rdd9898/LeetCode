package daily_practice.feb_2022.day20.question_2347;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void bestHand() {
        int[] ranks = {10,10,2,12,9};
        char[] suits = {'a','b','c','a','d'};
        Solution solution = new Solution();
        String ans = solution.bestHand(ranks, suits);
        System.out.println(ans);
    }
}