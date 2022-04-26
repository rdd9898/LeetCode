package hy.day30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<Integer> grayCode(int n) {
        int number = (int)Math.pow(2, n);
        boolean[] flags = new boolean[number];
        int[] list = new int[number];
        int[] answers = new int[number];
        for (int i = 0; i < number; i++) {
            list[i] = i;
        }
        answers[0] = 0;
        flags[0] = true;
        for (int i = 1; i < number; i++) {
            for (int j = 1; j <= n; j++) {

                // tmp 当前层的大小
                int flag = 0;
                int tmp = answers[i-1];
                for (int m = n; m >= 1; m--) {
                    if (tmp >= Math.pow(2, m-1)) {
                        if (m == j) {
                            flag = 1;
                        }
                        tmp -= Math.pow(2, m-1);
                    }
                }
                if (flag == 1) {
                    tmp += Math.pow(2, j-1);
                }

                if (tmp % Math.pow(2, j) == 0) {
//                if (answers[i-1] % Math.pow(2, j) == 0) {
                    if (!flags[list[answers[i-1]+(int)Math.pow(2,j-1)]]) {
                        flags[list[answers[i-1]+(int)Math.pow(2,j-1)]] = true;
                        answers[i] = list[answers[i-1]+(int)Math.pow(2,j-1)];
                        break;
                    }
                } else {
                    if (!flags[list[answers[i-1]-(int)Math.pow(2,j-1)]]) {
                        flags[list[answers[i-1]-(int)Math.pow(2,j-1)]] = true;
                        answers[i] = list[answers[i-1]-(int)Math.pow(2,j-1)];
                        break;
                    }
                }
            }
        }
        List<Integer> list1 = new ArrayList<>();
        for (int i =0; i < number; i++) {
            list1.add(answers[i]);
        }
        return list1;
    }
}
