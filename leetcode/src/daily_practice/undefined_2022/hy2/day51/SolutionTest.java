package daily_practice.undefined_2022.hy2.day51;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void winnerOfGame() {
        String colors = "AAABABB";
        Solution solution = new Solution();
        boolean ans = solution.winnerOfGame(colors);
        System.out.println(ans);
    }
}