package daily_practice.march_2023.day22.question_986;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void intervalIntersection() {

        int[][] firstList = {{0,2},{5,10},{13,23},{24,25}};
        int[][] secondList = {{1,5},{8,12},{15,24},{25,26}};
        Solution solution = new Solution();
        int[][] ints = solution.intervalIntersection(firstList, secondList);
        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.println(i);
            }
        }

    }
}