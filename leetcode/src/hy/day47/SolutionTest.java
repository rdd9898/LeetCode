package hy.day47;

import org.testng.annotations.Test;



public class SolutionTest {

    @Test
    public void test() {
        String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        String ans = Solution.longestWord(words);
        System.out.println(ans);
    }

}