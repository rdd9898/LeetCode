package daily_practice.may_2022.day27.question_interview_17_11;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findClosest() {

        String[] words = {"I","am","a","student","from","a","university","in","a","city"};
        String word1 = "a";
        String word2 = "student";
        Solution solution = new Solution();
        int right = 0;
        double cur = 2.5;
        right += (int)9.9 / cur;
        if (9.9 % cur != 0) right++;
        System.out.println(right);
        int ans = solution.findClosest(words, word1, word2);
        System.out.println(ans);

    }
}