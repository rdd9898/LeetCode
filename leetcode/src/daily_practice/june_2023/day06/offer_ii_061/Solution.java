package daily_practice.june_2023.day06.offer_ii_061;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 061. 和最小的 k 个数对
 * @author: Mr.Hu
 * @create: 2023-06-06 10:38
 **/
public class Solution {

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return nums1[o1[0]] + nums2[o1[1]] - nums1[o2[0]] - nums2[o2[1]];
            }
        });
        int m = nums1.length;
        int n = nums2.length;
        for (int i = 0; i < Math.min(m, k); i++) {
            pq.offer(new int[]{i, 0});
        }
        while (k-- > 0 && !pq.isEmpty()) {
            int[] ints = pq.poll();
            List<Integer> list = new ArrayList<>();
            list.add(nums1[ints[0]]);
            list.add(nums2[ints[1]]);
            res.add(list);
            if (ints[1] + 1 < n) pq.offer(new int[]{ints[0], ints[1] + 1});
        }
        return res;
    }
}
