package daily_practice.may_2022.day26.question_1870;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minSpeedOnTime() {

        int[] dist = {1,1,100000};
        double hour = 2.01;
        Solution solution = new Solution();
        int ans = solution.minSpeedOnTime(dist, hour);
        System.out.println(ans);

    }
}