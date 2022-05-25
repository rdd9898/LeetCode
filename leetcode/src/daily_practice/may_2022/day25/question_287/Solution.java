package daily_practice.may_2022.day25.question_287;

/**
 * 二分查找，判断数组中小于等于 mid 的数是否等于 mid
 * 等于 mid 说明重复的值大于 mid，否则小于等于 mid
 * @author 胡阳
 * @ClassName Solution
 * @description: 287.寻找重复数
 * @date 2022年05月25日 11:07
 */
public class Solution {

    public int findDuplicate(int[] nums) {
        int left = 1;
        int rigth = nums.length - 1;
        while (left <= rigth) {
            int mid = left + (rigth - left) / 2;
            int cur = 0;
            for (int temp: nums) {
                if (mid >= temp) cur++;
            }
            if (cur > mid) {
                rigth = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

}
