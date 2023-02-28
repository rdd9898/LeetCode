package daily_practice.feb_2022.day28.question_809;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void expressiveWords() {

        Solution solution = new Solution();
        String s = "abccc";
        String[] words = {"abcd","ddinso","ddiinnso","ddiinnssoo","ddiinso","dinsoo","ddiinsso","dinssoo","dinso"};
        int ans = solution.expressiveWords(s, words);
        System.out.println(ans);

    }
}