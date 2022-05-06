package daily_practice.undefined_2022.hy4.day05;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void toGoatLatin() {

        String sentence = "The quick brown fox jumped over the lazy dog";
        Solution solution = new Solution();
        String ans = solution.toGoatLatin(sentence);
        System.out.println(ans);

    }
}