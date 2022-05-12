package daily_practice.may_2022.day12.question_1337;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void kWeakestRows() {

        int[][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int k = 3;
        Solution solution = new Solution();
        int[] answers = solution.kWeakestRows(mat, k);
        for (int answer : answers) {
            System.out.println(answer);
        }

    }
}