package daily_practice.april_2023.day23.offer_57_ii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 57 - II. 和为s的连续正数序列
 * @author: Mr.Hu
 * @create: 2023-04-23 20:16
 **/
public class Solution {

    public int[][] findContinuousSequence(int target) {
        List<int[]> ans = new ArrayList<>();
        for (int i = 2; i < target; i++) {
            if (i % 2 == 1) {
                if (target % i == 0) {
                    if (target / i - i / 2 < 1) continue;
                    int[] tmp = new int[i];
                    for (int j = 0; j < i; j++) {
                        if (j == 0) tmp[j] = target / i - i / 2;
                        else tmp[j] = tmp[j - 1] + 1;
                    }
                    ans.add(tmp);
                }
            } else {
                if (target % i == i / 2) {
                    if (target / i - i / 2 + 1 < 1) continue;
                    int[] tmp = new int[i];
                    for (int j = 0; j < i; j++) {
                        if (j == 0) tmp[j] = target / i - i / 2 + 1;
                        else tmp[j] = tmp[j - 1] + 1;
                    }
                    ans.add(tmp);
                }
            }
        }
        int[][] ansLast = ans.toArray(new int[ans.size()][]);
        Arrays.sort(ansLast, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        return ansLast;
    }

}
