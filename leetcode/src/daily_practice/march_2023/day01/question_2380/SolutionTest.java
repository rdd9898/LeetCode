package daily_practice.march_2023.day01.question_2380;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void secondsToRemoveOccurrences() {

        String s = "11100";
        Solution solution = new Solution();
        int ans = solution.secondsToRemoveOccurrences(s);
        System.out.println(ans);

    }
}