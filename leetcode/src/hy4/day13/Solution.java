package hy4.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 2231.按奇偶性交换后的最大数字
 * @author: Mr.Hu
 * @create: 2022-05-01 22:21
 **/
public class Solution {

    public int largestInteger(int num) {
        String s = String.valueOf(num);
        char[] chars = s.toCharArray();
        boolean[] flag = new boolean[chars.length];
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] - '0') % 2 == 0) {
                flag[i] = true;
                list1.add(chars[i] - '0');
            } else {
                list2.add(chars[i] - '0');
            }
        }
        list1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        list2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        StringBuffer sb = new StringBuffer();
        int a = 0;
        int b = 0;
        for (int i = 0; i < chars.length; i++) {
            if (flag[i]) {
                sb.append(list1.get(a));
                a++;
            } else {
                sb.append(list2.get(b));
                b++;
            }
        }

        return Integer.parseInt(sb.toString());
    }

}
