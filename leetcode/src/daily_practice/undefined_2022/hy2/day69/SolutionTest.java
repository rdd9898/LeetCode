package daily_practice.undefined_2022.hy2.day69;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void outerTrees() {

        int[][] trees = {{1,1},{2,2},{2,0},{2,4},{3,3},{4,2}};
        Solution solution = new Solution();
        int[][] answers = solution.outerTrees(trees);
        for (int[] answer : answers) {
            for (int i : answer) {
                System.out.print(i + ",");
            }
            System.out.println();
        }

    }
}