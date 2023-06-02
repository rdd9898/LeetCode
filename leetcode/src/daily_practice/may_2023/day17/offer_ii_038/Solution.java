package daily_practice.may_2023.day17.offer_ii_038;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 038. 每日温度
 * @author: Mr.Hu
 * @create: 2023-05-17 15:05
 **/
public class Solution {

    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> deque = new ArrayDeque<>();
        int[] res = new int[temperatures.length];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < temperatures.length; i++) {
            if (min < temperatures[i]) {
                while (!deque.isEmpty()) {
                    int index = deque.pop();
                    if (temperatures[i] > temperatures[index]) res[index] = i - index;
                    else {
                        deque.push(index);
                        break;
                    }
                }
            }
            min = temperatures[i];
            deque.push(i);
        }
        return res;
    }

}
