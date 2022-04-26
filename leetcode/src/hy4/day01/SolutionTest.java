package hy4.day01;

import org.junit.Test;

import static org.junit.Assert.*;

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