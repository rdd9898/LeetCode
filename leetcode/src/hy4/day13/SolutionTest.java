package hy4.day13;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void largestInteger() {

        int num = 1234;
        Solution solution = new Solution();
        int answer = solution.largestInteger(num);
        System.out.println(answer);

    }
}