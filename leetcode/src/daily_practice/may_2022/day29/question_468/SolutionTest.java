package daily_practice.may_2022.day29.question_468;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void validIPAddress() {

        String queryIP = "2001:0db8:85a3:0:0:8A2E:0370:7334:";
        Solution solution = new Solution();
        String ans = solution.validIPAddress(queryIP);
        System.out.println(ans);

    }
}