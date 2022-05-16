package daily_practice.may_2022.day16.question_118;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void generate() {

        Solution solution = new Solution();
        List<List<Integer>> generate = solution.generate(5);
        System.out.println(generate);

    }
}