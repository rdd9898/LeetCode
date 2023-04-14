package daily_practice.april_2023.day13.offer_21;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 * @author: Mr.Hu
 * @create: 2023-04-13 21:32
 **/
public class Solution {

    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (nums[left] % 2 == 1 && left < nums.length - 1) left++;
            while (nums[right] % 2 == 0 && right >= 1) right--;
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        return nums;
    }

}
