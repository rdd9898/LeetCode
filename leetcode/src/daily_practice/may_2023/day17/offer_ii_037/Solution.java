package daily_practice.may_2023.day17.offer_ii_037;

import java.util.Arrays;
import java.util.Stack;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 037. 小行星碰撞
 * @author: Mr.Hu
 * @create: 2023-05-17 10:54
 **/
public class Solution {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            int last = asteroids[i];
            while (true) {
                if (stack.isEmpty()) {
                    stack.push(last);
                    break;
                }
                int cur = stack.pop();
                if (cur > 0 && last < 0) {
                    if (cur + last > 0) {
                        stack.push(cur);
                        break;
                    }
                    else if (cur + last == 0) {
                        break;
                    } else {
                        if (stack.isEmpty()) {
                            stack.push(last);
                            break;
                        }
                    }
                } else {
                    stack.push(cur);
                    stack.push(last);
                    break;
                }
            }
        }
        int[] res = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }

}
