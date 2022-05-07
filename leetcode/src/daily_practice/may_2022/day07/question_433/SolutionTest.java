package daily_practice.may_2022.day07.question_433;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void minMutation() {
        String start = "AACCTTGG";
        String end = "AATTCCGG";
        String[] bank = {"AATTCCGG","AACCTGGG","AACCCCGG","AACCTACC"};
        Solution solution = new Solution();
        int ans = solution.minMutation(start, end, bank);
        System.out.println(ans);
    }
}