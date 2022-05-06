package daily_practice.undefined_2022.hy3.day25;

/**
 * @author ：HuYang
 * @date ：Created in 2022/2/21 19:13
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public static String pushDominoes(String dominoes) {
        int[] dom = new int[dominoes.length()];
        char[] chars = dominoes.toCharArray();
        boolean flag = false;
        for (int i = 0; i < dominoes.length(); i++) {
            if (chars[i] == 'L') {
                dom[i]--;
            } else if (chars[i] == 'R') {
                dom[i]++;
            }
        }
        int[] tep = new int[dominoes.length()];
        while (!flag) {
            for (int i = 0; i < dominoes.length(); i++) {
                if (dom[i] > 0) {
                    if (i != dominoes.length()-1) {
                        tep[i + 1]++;
                        flag = true;
                    }
                } else if (dom[i] < 0) {
                    if (i != 0) {
                        tep[i - 1]--;
                        flag = true;
                    }
                }
            }
            for (int i = 0; i < dominoes.length(); i++) {
                dom[i] += tep[i];
            }
        }

        for (int i = 0; i < dominoes.length(); i++) {
            if (dom[i] > 0) {
                chars[i] = 'R';
            } else if (dom[i] < 0) {
                chars[i] = 'L';
            } else {
                chars[i] = '.';
            }
        }


        return new String(chars);
    }
}
