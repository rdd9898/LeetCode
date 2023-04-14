package daily_practice.april_2023.day12.offer_11;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 11. 旋转数组的最小数字
 * @author: Mr.Hu
 * @create: 2023-04-12 10:37
 **/
public class Solution {

    public int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] > numbers[right]) {
                left = mid + 1;
            } else if (numbers[mid] < numbers[right]) {
                right = mid;
            } else {
                right--;
            }
        }
        return numbers[left];
    }

}
