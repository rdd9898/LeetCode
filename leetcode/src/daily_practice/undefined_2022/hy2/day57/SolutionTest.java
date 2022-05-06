package daily_practice.undefined_2022.hy2.day57;

import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void selfDividingNumbers() {
        int left = 47;
        int right = 85;
        Solution solution = new Solution();
        List<Integer> answers = solution.selfDividingNumbers(left, right);
        answers.forEach(System.out::println);
    }
}