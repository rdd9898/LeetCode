package daily_practice.march_2023.day30.question_17;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void letterCombinations() {

        String digits = "23";
        Solution solution = new Solution();
        List<String> list = solution.letterCombinations(digits);
        System.out.println(list);

    }
}