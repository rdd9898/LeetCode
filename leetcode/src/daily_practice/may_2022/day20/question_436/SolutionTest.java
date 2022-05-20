package daily_practice.may_2022.day20.question_436;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findRightInterval() {
        int[][] intervals = {{1,1},{3,4}};
        Solution solution = new Solution();
        int[] answers = solution.findRightInterval(intervals);
        for (int answer : answers) {
            System.out.println(answer);
        }
    }
}