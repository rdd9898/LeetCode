package daily_practice.may_2022.day16.question_350;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 350.两个数组的交集Ⅱ
 * @date 2022年05月16日 9:28
 */
public class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        int[] ans = new int[nums1.length];
        int index = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.getOrDefault(nums2[i], 0) > 0) {
                ans[index] = nums2[i];
                map.put(nums2[i], map.getOrDefault(nums2[i], 0) - 1);
                index++;
            }
        }
        return Arrays.copyOfRange(ans, 0, index);
    }

}
