package hy4.day05;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void toGoatLatin() {

        String sentence = "The quick brown fox jumped over the lazy dog";
        Solution solution = new Solution();
        String ans = solution.toGoatLatin(sentence);
        System.out.println(ans);

    }
}