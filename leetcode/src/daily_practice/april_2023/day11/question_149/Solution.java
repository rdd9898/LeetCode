package daily_practice.april_2023.day11.question_149;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetCode
 * @description: 149.直线上最多的点数
 * @author: Mr.Hu
 * @create: 2023-04-11 10:44
 **/
public class Solution {

    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2) return n;
        int ret = 0;
        for (int i = 0; i < n; i++) {
            if (ret >= n - i || ret > n / 2) break;
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = i + 1; j < n; j++) {
                int x = points[i][0] - points[j][0];
                int y = points[i][1] - points[j][1];
                if (x == 0) y = 1;
                else if (y == 0) x = 1;
                else {
                    if (y < 0) {
                        x = -x;
                        y = -y;
                    }
                    int gcdXY = gcd(Math.abs(x), Math.abs(y));
                    x /= gcdXY;
                    y /= gcdXY;
                }
                int key = y + x * 20001;
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
            int maxn = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int num = entry.getValue();
                maxn = Math.max(maxn, num + 1);
            }
            ret = Math.max(ret, maxn);
        }
        return ret;
    }

    public int gcd(int a, int b) {
        return b != 0 ? gcd(b, a % b) : a;
    }

}
