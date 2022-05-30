package daily_practice.may_2022.day30.question_56;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void merge() {

        int[][] intervals = {{1,4},{4,5}};
        Solution solution = new Solution();
        int[][] ans = solution.merge(intervals);
        for (int[] ints : ans) {
            for (int anInt : ints) {
                System.out.print(anInt);
                System.out.println();
            }
            System.out.println();
        }

    }
}