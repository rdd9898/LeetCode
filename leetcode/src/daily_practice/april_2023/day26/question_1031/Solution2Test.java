package daily_practice.april_2023.day26.question_1031;

import org.junit.Test;

/**
 * @program: LeetCode
 * @description:
 * @author: Mr.Hu
 * @create: 2023-04-26 10:53
 **/
public class Solution2Test {

    @Test
    public void maxSumTwoNoOverlap() {
        Solution2 solution = new Solution2();
        int[] nums = {1, 0, 3};
        int firstLen = 1;
        int secondLen = 2;
        int ans = solution.maxSumTwoNoOverlap(nums, firstLen, secondLen);
        System.out.println(ans);
    }

}
