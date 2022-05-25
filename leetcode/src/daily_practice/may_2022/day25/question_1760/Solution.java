package daily_practice.may_2022.day25.question_1760;

/**
 * 二分查找，将问题转换成已知袋子里最大放多少球，求需要分几次
 * @author 胡阳
 * @ClassName Solution
 * @description: 1760.袋子里最少数目的球
 * @date 2022年05月25日 10:19
 */
public class Solution {

    public int minimumSize(int[] nums, int maxOperations) {
        int right = 0;
        for (int tmp: nums) right = Math.max(right, tmp);
        int left = 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cur = 0;
            for (int tmp: nums) {
                cur += tmp / mid;
                if (tmp % mid == 0) {
                    cur--;
                }
            }
            if (cur < maxOperations) {
                right = mid - 1;
            } else if (cur > maxOperations) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

}
