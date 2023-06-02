package daily_practice.may_2023.day10.question_1015;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void smallestRepunitDivByK() {
        int k = 4;
        Solution solution = new Solution();
        int ans = solution.smallestRepunitDivByK(k);
        System.out.println(ans);
    }
}