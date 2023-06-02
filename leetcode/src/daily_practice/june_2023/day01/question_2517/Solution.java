package daily_practice.june_2023.day01.question_2517;

import java.util.Arrays;

/**
 * @program: LeetCode
 * @description: 2517. 礼盒的最大甜蜜度
 * @author: Mr.Hu
 * @create: 2023-06-01 19:51
 **/
public class Solution {

    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int left = 0;
        int right = price[price.length - 1] - price[0];
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (pd(mid, price, k)) left = mid + 1;
            else right = mid;
        }
        if (pd(left, price, k)) return left;
        return left - 1;
    }

    private boolean pd(int mid, int[] price, int k) {
        int ans = 1;
        int pre = price[0];
        for (int i = 1; i < price.length; i++) {
            if (price[i] - pre >= mid) {
                ans++;
                pre = price[i];
                if (ans == k) return true;
            }
        }
        return false;
    }
}
