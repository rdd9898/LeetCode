package hy2.day54;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void missingRolls() {
        int[] rolls = {1,5,6};
        int mean = 3;
        int n = 4;
        Solution solution = new Solution();
        int[] answers = solution.missingRolls(rolls, mean, n);
        for (int answer : answers) {
            System.out.println(answer);
        }
    }
}