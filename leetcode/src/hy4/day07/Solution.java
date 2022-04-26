package hy4.day07;

import java.util.ArrayList;

/**
 * @program: LeetCode
 * @description: 868.二进制间距
 * @author: Mr.Hu
 * @create: 2022-04-24 19:35
 **/
public class Solution {

    public int binaryGap(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while (n != 0) {
            int index = n % 2;
            n /= 2;
            list.add(index);
        }
        int lastIndex = list.lastIndexOf(1);
        int firstIndex = list.indexOf(1);
        if (firstIndex == lastIndex || !list.contains(1)) {
            return 0;
        }
        int ans = 0;
        int tmp = firstIndex;
        for (int i = firstIndex + 1; i < list.size(); i++) {
            if (list.get(i) == 1) {
                if (i - tmp > ans) {
                    ans = i - tmp;
                }
                tmp = i;
            }
        }
        return ans;
    }

}
