package hy.day47;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {
        String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        String ans = Solution.longestWord(words);
        System.out.println(ans);
    }

}