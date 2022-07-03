package daily_practice.july_2022.day04.question_347;

import java.util.*;

/**
 * @program: LeetCode
 * @description: 347.前 K 个高频元素
 * @author: Mr.Hu
 * @create: 2022-07-03 20:38
 **/
public class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            queue.offer(new int[]{num, count});

        }
        for (int i = 0; i < k; i++) {
            ans[i] = queue.poll()[0];
        }
        return ans;
    }

}
