package daily_practice.may_2022.day28.question_1818;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minAbsoluteSumDiff() {

        int[] nums1 = {1, 7, 5};
        int[] nums2 = {2, 3, 5};
        Solution solution = new Solution();
        int ans = solution.minAbsoluteSumDiff(nums1, nums2);
        System.out.println(ans);

    }
}