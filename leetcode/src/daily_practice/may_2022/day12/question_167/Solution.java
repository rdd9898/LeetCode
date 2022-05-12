package daily_practice.may_2022.day12.question_167;

/**
 * @program: LeetCode
 * @description: 167.两数之和 Ⅱ - 输入有序数组
 * @author: Mr.Hu
 * @create: 2022-05-12 09:59
 **/
public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            int left = i + 1;
            int right = n - 1;
            boolean flag = false;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (numbers[mid] < target - numbers[i]) {
                    left = mid + 1;
                } else if (numbers[mid] > target - numbers[i]) {
                    right = mid - 1;
                } else {
                    ans[0] = i + 1;
                    ans[1] = mid + 1;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        return ans;
    }

}
