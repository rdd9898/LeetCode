package daily_practice.may_2023.day04.offer_ii_001;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 001. 整数除法
 * @author: Mr.Hu
 * @create: 2023-05-04 20:30
 **/
public class Solution {

    public int divide(int a, int b) {
        boolean flag = false;
        if (a == Integer.MIN_VALUE) {
            if (b == 1) return a;
            if (b == -1) return Integer.MAX_VALUE;
        }
        if (b == Integer.MIN_VALUE) {
            if (a == Integer.MIN_VALUE) return 1;
            else return 0;
        }
        if (a == 0) return 0;
        if (a > 0) {
            flag = true;
            a = -a;
        }
        if (b > 0) {
            flag = !flag;
            b = -b;
        }

        List<Integer> candidates = new ArrayList<>();
        candidates.add(b);
        int index = 0;
        while (candidates.get(index) >= a - candidates.get(index)) {
            candidates.add(candidates.get(index) + candidates.get(index));
            index++;
        }
        int ans = 0;
        for (int i = candidates.size() - 1; i >= 0; i--) {
            if (candidates.get(i) >= a) {
                ans += 1 << i;
                a -= candidates.get(i);
            }
        }
        return flag ? -ans : ans;
    }

}
