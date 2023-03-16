package daily_practice.march_2023.day16.question_733;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void floodFill() {

        Solution solution = new Solution();
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int color = 2;
        int[][] images = solution.floodFill(image, sr, sc, color);
        for (int[] ints : images) {
            for (int i : ints) {
                System.out.println(i);
            }
        }

    }
}