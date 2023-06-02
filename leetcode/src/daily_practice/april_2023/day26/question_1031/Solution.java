package daily_practice.april_2023.day26.question_1031;

/**
 * @program: LeetCode
 * @description: 1031. 两个非重叠子数组的最大和
 * @author: Mr.Hu
 * @create: 2023-04-26 10:06
 **/
public class Solution {

    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int ans = Integer.MIN_VALUE;
        int curFirstLen = 0;
        int curSecondLen;
        int firstSum = 0;
        int secondSum;
        for (int i = 0; i < nums.length; i++) {
            firstSum += nums[i];
            curFirstLen++;
            if (curFirstLen == firstLen) {
                secondSum = 0;
                curSecondLen = 0;
                for (int j = 0; j <= i - firstLen; j++) {
                    secondSum += nums[j];
                    curSecondLen++;
                    if (curSecondLen == secondLen) {
                        ans = Math.max(ans, secondSum + firstSum);
                        secondSum -= nums[j - secondLen + 1];
                        curSecondLen--;
                    }
                }
                secondSum = 0;
                curSecondLen = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    secondSum += nums[j];
                    curSecondLen++;
                    if (curSecondLen == secondLen) {
                        ans = Math.max(ans, secondSum + firstSum);
                        secondSum -= nums[j - secondLen + 1];
                        curSecondLen--;
                    }
                }
                firstSum -= nums[i - firstLen + 1];
                curFirstLen--;
            }
        }
        return ans;
    }

}
