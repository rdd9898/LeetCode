package hy2.day58;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void canReorderDoubled() {
        int[] arr = {1,2,4,16,8,4};
        Solution solution = new Solution();
        boolean ans = solution.canReorderDoubled(arr);
        System.out.println(ans);
    }
}