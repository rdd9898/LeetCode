package daily_practice.march_2023.day22.question_11;

/**
 * @program: LeetCode
 * @description: 11.盛最多水的容器
 * @author: Mr.Hu
 * @create: 2023-03-22 22:16
 **/
public class Solution {

    public int maxArea(int[] height) {
        int ans = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            ans = Integer.max(ans, Integer.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }

}
