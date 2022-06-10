package daily_practice.june_2022.day09.question_43;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void multiply() {

        String num1 = "123";
        String num2 = "456";
        Solution solution = new Solution();
        String ans = solution.multiply(num1, num2);
        System.out.println(ans);

    }
}