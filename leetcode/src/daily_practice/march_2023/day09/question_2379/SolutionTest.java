package daily_practice.march_2023.day09.question_2379;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minimumRecolors() {
        String blocks = "BWBBWWBBBWBWWWBWWBBWBWBBWBB";
        int k = 11;
        Solution solution = new Solution();
        int ans = solution.minimumRecolors(blocks, k);
        System.out.println(ans);
    }
}