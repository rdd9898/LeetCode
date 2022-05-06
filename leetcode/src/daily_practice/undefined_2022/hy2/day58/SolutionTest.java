package daily_practice.undefined_2022.hy2.day58;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void canReorderDoubled() {
        int[] arr = {1,2,4,16,8,4};
        Solution solution = new Solution();
        boolean ans = solution.canReorderDoubled(arr);
        System.out.println(ans);
    }
}