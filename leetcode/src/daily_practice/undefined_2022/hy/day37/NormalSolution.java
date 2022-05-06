package daily_practice.undefined_2022.hy.day37;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;



/**
 * @author 胡阳
 * @ClassName NormalSolution
 * @description:
 * @date 2022年01月14日 11:08
 */
public class NormalSolution {
    /**
     * @Description:
     * @Param: [nums1, nums2, k]
     * @return: java.util.List<java.util.List < java.lang.Integer>>
     * @Author: HuYang
     * @Date:2022/1/14 11:09
     */
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(k, (o1, o2) -> {
            return nums1[o1[0]] + nums2[o1[1]] - nums1[o2[0]] - nums2[o2[1]];
        });
        List<List<Integer>> ans = new ArrayList<>();
        int m = nums1.length;
        int n = nums2.length;
        for (int i = 0; i < Math.min(m, k); i++) {
            pq.offer(new int[]{i, 0});
        }
        while (k-- > 0 && !pq.isEmpty()) {
            int[] idxPair = pq.poll();
            List<Integer> list = new ArrayList<>();
            list.add(nums1[idxPair[0]]);
            list.add(nums2[idxPair[1]]);
            ans.add(list);
            if (idxPair[1] + 1 < n) {
                pq.offer(new int[]{idxPair[0], idxPair[1] + 1});
            }
        }
        return ans;
    }
}
