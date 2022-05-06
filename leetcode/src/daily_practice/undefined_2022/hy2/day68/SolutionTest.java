package daily_practice.undefined_2022.hy2.day68;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void shortestToChar() {
        String s = "loveleetcode";
        char c = 'e';
        Solution solution = new Solution();
        int[] answers = solution.shortestToChar(s, c);
        for (int answer : answers) {
            System.out.print(answer + "\t");
        }
    }
}