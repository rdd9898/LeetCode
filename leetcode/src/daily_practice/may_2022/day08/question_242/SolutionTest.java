package daily_practice.may_2022.day08.question_242;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isAnagram() {

        String s = "aacc";
        String t = "ccac";
        Solution solution = new Solution();
        boolean ans = solution.isAnagram(s, t);
        System.out.println(ans);

    }
}