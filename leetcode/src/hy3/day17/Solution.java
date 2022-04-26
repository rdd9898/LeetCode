package com.hy.day17;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：HuYang
 * @date ：Created in 2022/2/10 12:07
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public static List<String> simplifiedFractions(int n) {
        List<String> list = new ArrayList<>();
        // 分母
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (gcd(j, i) == 1) {
                    list.add(j + "/" + i);
                }
            }
        }
        return list;
    }
    public static int gcd(int a, int b) {
        return b != 0 ? gcd(b, a % b) : a;
    }

}
