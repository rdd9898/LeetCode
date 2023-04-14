package daily_practice.april_2023.day06.question_1017;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 1017.负二进制转换
 * @author: Mr.Hu
 * @create: 2023-04-06 10:50
 **/
public class Solution {

    public String baseNeg2(int n) {
        if (n == 0) return "0";
        if (n == 1) return "1";
        List<int[]> temp = new ArrayList<>();
        temp.add(new int[]{0, 1});
        temp.add(new int[]{-2, -1});
        int pre = 0;
        int last = 1;
        int step = 4;
        boolean flag = true;
        while (pre > n || last < n) {
            int[] ints1 = temp.get(temp.size() - 1);
            int[] ints2 = temp.get(temp.size() - 2);
            if (flag) {
                pre = ints1[0] + step;
                last = ints2[1] + step;
            } else {
                pre = ints2[0] + step;
                last = ints1[1] + step;
            }
            temp.add(new int[]{pre, last});
            step = step * -2;
            flag = !flag;
        }
        step /= -2;
        StringBuffer ans = new StringBuffer();
        for (int i = temp.size() - 1; i >= 1; i--) {
            int[] ints = temp.get(i);
            if (n >= ints[0] && n <= ints[1]) {
                n -= step;
                ans.append("1");
            } else {
                ans.append("0");
            }
            step /= -2;
        }
        ans.append(n);
        return ans.toString();
    }

}
