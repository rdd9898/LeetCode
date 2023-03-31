package daily_practice.march_2023.day31.question_2367;

/**
 * @program: LeetCode
 * @description: 2367.算术三元组的数目
 * @author: Mr.Hu
 * @create: 2023-03-31 14:45
 **/
public class Solution {

    public int arithmeticTriplets(int[] nums, int diff) {
        int ans = 0;
        int length = nums.length;
        for (int i = 0; i < length - 2; i++) {
            int j = i + 1;
            int k = j + 1;
            while (j < k) {
                if (nums[j] - nums[i] < diff) {
                    j++;
                } else if (nums[j] - nums[i] > diff) {
                    break;
                }
                if (nums[k] - nums[j] < diff) {
                    k++;
                } else if (nums[k] - nums[j] > diff) {
                    break;
                }
                if (k == length || j == length) break;
                if (nums[k] - nums[j] == diff && nums[j] - nums[i] == diff) {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }

}
