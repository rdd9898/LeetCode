package hy2.day66;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void numberOfLines() {
        int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "abcdefghijklmnopqrstuvwxyz";
        Solution solution = new Solution();
        int[] answers = solution.numberOfLines(widths, s);
        for (int answer : answers) {
            System.out.println(answer);
        }
    }
}