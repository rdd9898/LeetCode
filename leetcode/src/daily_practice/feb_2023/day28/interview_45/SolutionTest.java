package daily_practice.feb_2023.day28.interview_45;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void minNumber() {
        int[] nums = {1440,7548,4240,6616,733,4712,883,8,9576};
        SolutionNormal solution = new SolutionNormal();
        String ans = solution.minNumber(nums);
        System.out.println(ans);
    }
}