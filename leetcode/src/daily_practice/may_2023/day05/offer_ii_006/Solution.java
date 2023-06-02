package daily_practice.may_2023.day05.offer_ii_006;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 006. 排序数组中两个数字之和
 * @author: Mr.Hu
 * @create: 2023-05-05 20:55
 **/
public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] < target) {
                left++;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else break;
        }
        return new int[]{left, right};
    }

}
