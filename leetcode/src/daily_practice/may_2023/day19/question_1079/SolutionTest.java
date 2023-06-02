package daily_practice.may_2023.day19.question_1079;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void numTilePossibilities() {
        String tiles = "AAB";
        Solution solution = new Solution();
        int ans = solution.numTilePossibilities(tiles);
        System.out.println(ans);
    }
}