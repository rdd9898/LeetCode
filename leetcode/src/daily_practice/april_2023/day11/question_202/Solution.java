package daily_practice.april_2023.day11.question_202;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 202.快乐数
 * @author: Mr.Hu
 * @create: 2023-04-11 10:02
 **/
public class Solution {

    public boolean isHappy(int n) {
        if (n == 1) return true;
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while (n != 1) {
            int temp = 0;
            while (n / 10 != 0) {
                temp += (n % 10) * (n % 10);
                n /= 10;
            }
            temp += n * n;
            if (list.contains(temp)) return false;
            list.add(temp);
            n = temp;
        }
        return true;
    }

}
