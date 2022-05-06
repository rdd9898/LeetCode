package daily_practice.undefined_2022.hy4.day01;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void Test() {
        String s = "abcde";
        String goal = "cdeab";
        Solution solution = new Solution();
        boolean ans = solution.rotateString(s, goal);
        System.out.println(ans);
    }

}