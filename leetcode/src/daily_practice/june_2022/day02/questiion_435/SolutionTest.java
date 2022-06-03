package daily_practice.june_2022.day02.questiion_435;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void eraseOverlapIntervals() {

        int[][] intervals = {{0,2},{1,3},{2,4},{3,5},{4,6}};
        Solution solution = new Solution();
        int ans = solution.eraseOverlapIntervals(intervals);
        System.out.println(ans);

    }
}