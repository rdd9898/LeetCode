package daily_practice.june_2023.day01.offer_ii_057;

import java.util.TreeSet;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 057. 值和下标之差都在给定的范围内
 * @author: Mr.Hu
 * @create: 2023-06-01 20:59
 **/
public class Solution {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int n = nums.length;
        TreeSet<Long> set = new TreeSet<Long>();
        for (int i = 0; i < n; i++) {
            Long ceiling = set.ceiling((long) nums[i] - (long) t);
            if (ceiling != null && ceiling <= (long) nums[i] + (long) t) {
                return true;
            }
            set.add((long) nums[i]);
            if (i >= k) {
                set.remove((long) nums[i - k]);
            }
        }
        return false;
    }
}
