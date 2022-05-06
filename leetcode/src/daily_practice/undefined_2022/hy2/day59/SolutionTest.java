package daily_practice.undefined_2022.hy2.day59;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void nextGreatestLetter() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        Solution solution = new Solution();
        char ans = solution.nextGreatestLetter(letters, target);
        System.out.println(ans);
    }
}