package daily_practice.may_2023.day25.question_2451;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void oddString() {
        String[] words = {"adc","wzy","abc"};
        Solution solution = new Solution();
        String ans = solution.oddString(words);
        System.out.println(ans);
    }
}