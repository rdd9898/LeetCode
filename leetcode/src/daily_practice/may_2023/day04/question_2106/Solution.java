package daily_practice.may_2023.day04.question_2106;

/**
 * @program: LeetCode
 * @description: 2106. 摘水果
 * @author: Mr.Hu
 * @create: 2023-05-04 20:18
 **/
public class Solution {

    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int left = 0;
        int right = 0;
        int n = fruits.length;
        int sum = 0;
        int ans = 0;
        while (right < n) {
            sum += fruits[right][1];
            while (left <= right && step(fruits, startPos, left, right) > k) {
                sum -= fruits[left][1];
                left++;
            }
            ans = Math.max(ans, sum);
            right++;
        }
        return ans;
    }

    public int step (int[][] fruits, int startPos, int left, int right) {
        return Math.min(Math.abs(startPos - fruits[right][0]), Math.abs(startPos - fruits[left][0])) + fruits[right][0] - fruits[left][0];
    }

}
