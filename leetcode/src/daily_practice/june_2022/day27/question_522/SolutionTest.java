package daily_practice.june_2022.day27.question_522;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findLUSlength() {

        String[] strs = {"aaa","aaa","aa"};
        Solution solution = new Solution();
        int ans = solution.findLUSlength(strs);
        System.out.println(ans);

    }
}