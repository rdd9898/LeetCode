package daily_practice.may_2022.day17.question_953;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isAlienSorted() {

        String[] words = {"word","world","row"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        Solution solution = new Solution();
        boolean ans = solution.isAlienSorted(words, order);
        System.out.println(ans);

    }
}