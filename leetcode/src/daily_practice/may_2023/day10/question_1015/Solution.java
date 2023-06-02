package daily_practice.may_2023.day10.question_1015;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @program: LeetCode
 * @description: 1015. 可被 K 整除的最小整数
 * @author: Mr.Hu
 * @create: 2023-05-10 09:57
 **/
public class Solution {

    public int smallestRepunitDivByK(int k) {
        int div = 1 % k;
        int length = 1;
        HashSet<Integer> set = new HashSet<>();
        set.add(div);
        while (div != 0) {
            div = 10 * div + 1;
            div %= k;
            if (set.contains(div)) return -1;
            set.add(div);
            length++;
        }
        return length;
    }

}
