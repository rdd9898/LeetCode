package com.hy.day14;

/**
 * @author ：HuYang
 * @date ：Created in 2022/2/7 16:31
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public static String longestDiverseString(int a, int b, int c) {
        String s = "";
        StringBuilder stringBuilder = new StringBuilder(s);
        int flagA = 0;
        int flagB = 0;
        int flagC = 0;
        int[] flag = new int[3];

        while (true) {

            if (flagA < 2) {
                flag[0] = a;
            } else {
                flag[0] = 0;
                flagA = 0;
            }
            if (flagB < 2) {
                flag[1] = b;
            } else {
                flag[1] = 0;
                flagB = 0;
            }
            if (flagC < 2) {
                flag[2] = c;
            } else {
                flag[2] = 0;
                flagC = 0;
            }

            if (flag[1] == 0 && flag[0] ==0 && flag[2] == 0) {
                break;
            }


            if (flag[0] >= flag[1] && flag[0] >= flag[2]) {
                stringBuilder.append("a");
                flagA++;
                a--;

            } else if (flag[1] >= flag[0] && flag[1] >= flag[2]) {
                stringBuilder.append("b");
                flagB++;
                b--;

            } else if (flag[2] >= flag[0] && flag[2] >= flag[1]) {
                stringBuilder.append("c");
                flagC++;
                c--;
            }

        }
        return stringBuilder.toString();
    }
}
