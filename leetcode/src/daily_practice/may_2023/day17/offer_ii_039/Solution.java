package daily_practice.may_2023.day17.offer_ii_039;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 039. 直方图最大矩形面积
 * @author: Mr.Hu
 * @create: 2023-05-17 16:20
 **/
public class Solution {

    public int largestRectangleArea(int[] heights) {
        int length = heights.length;
        int[] left = new int[length];
        int[] right = new int[length];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < length; i++) {
            while (!deque.isEmpty() && heights[deque.peek()] >= heights[i]) {
                deque.pop();
            }
            if (deque.isEmpty()) left[i] = -1;
            else left[i] = deque.peek();
            deque.push(i);
        }
        
        deque.clear();
        for (int i = length - 1; i >= 0; i--) {
            while (!deque.isEmpty() && heights[deque.peek()] >= heights[i]) {
                deque.pop();
            }
            if (deque.isEmpty()) right[i] = length;
            else right[i] = deque.peek();
            deque.push(i);
        }

        int ans = 0;
        for (int i = 0; i < length; i++) {
            ans = Math.max(ans, (right[i] - left[i] - 1) * heights[i]);
        }
        return ans;
    }

}
