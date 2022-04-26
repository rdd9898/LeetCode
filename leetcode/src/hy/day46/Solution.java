package hy.day46;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description:
 * @date 2022年03月15日 10:52
 */
public class Solution {
    public static int countMaxOrSubsets(int[] nums) {
        int target = 0;
        // 找到最大值
        for (int i = 0; i < nums.length; i++) {
            target |= nums[i];
        }
        int max = 1 << nums.length;
        int ans = 0;
        for (int i = 0; i < max; i++) {
            if (calculateOr(nums, i) == target) {
                ans++;
            }
        }
        return ans;
    }
    public static int calculateOr(int nums[],int mask){
        int ans=0;
        for(int i = 0; i < nums.length; i++) {
            // mask二进制数表示取那几个数
            if((mask & ( 1 << i )) != 0) {
                ans |= nums[i];
            }
        }
        return ans;
    }
}
