package daily_practice.june_2022.day04.question_929;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void numUniqueEmails() {

        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        Solution solution = new Solution();
        int ans = solution.numUniqueEmails(emails);
        System.out.println(ans);

    }
}