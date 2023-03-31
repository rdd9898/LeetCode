package daily_practice.march_2023.day30.question_22;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void generateParenthesis() {

        Solution solution = new Solution();
        List<String> list = solution.generateParenthesis(3);
        System.out.println(list);

    }
}