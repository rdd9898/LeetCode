package daily_practice.undefined_2022.hy.day47;

import org.junit.Test;



public class SolutionTest {

    @Test
    public void test() {
        String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        String ans = Solution.longestWord(words);
        System.out.println(ans);
    }

}