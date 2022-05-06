package daily_practice.undefined_2022.hy2.day64;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void uniqueMorseRepresentations() {
        String[] words = {"gin", "zen", "gig", "msg"};
        Solution solution = new Solution();
        int ans = solution.uniqueMorseRepresentations(words);
        System.out.println(ans);
    }
}