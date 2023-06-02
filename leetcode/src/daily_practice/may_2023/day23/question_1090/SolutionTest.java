package daily_practice.may_2023.day23.question_1090;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void largestValsFromLabels() {
        int[] values = {5,4,3,2,1};
        int[] labels = {1,1,2,2,3};
        int numWanted = 3, useLimit = 1;
        Solution solution = new Solution();
        solution.largestValsFromLabels(values, labels, numWanted, useLimit);
    }
}