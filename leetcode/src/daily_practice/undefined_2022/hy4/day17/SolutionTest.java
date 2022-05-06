package daily_practice.undefined_2022.hy4.day17;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void maxDistance() {

        int[] position = {1,2,3,4,7};
        int m = 3;
        Solution solution = new Solution();
        int ans = solution.maxDistance(position, m);
        System.out.println(ans);

    }
}