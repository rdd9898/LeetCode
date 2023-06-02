package daily_practice.may_2023.day04.offer_ii_002;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 002. 二进制加法
 * @author: Mr.Hu
 * @create: 2023-05-04 22:11
 **/
public class Solution {

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int length1 = a.length();
        int length2 = b.length();
        int max = Integer.max(length1, length2);
        int tmp = 0;
        for (int i = 0; i < max; i++) {
            char c1 = '0';
            char c2 = '0';
            if (length1 - i - 1 >= 0) {
                c1 = a.charAt(length1 - i - 1);
            }
            if (length2 - i - 1 >= 0) {
                c2 = b.charAt(length2 - i - 1);
            }
            if ((c1 - '0') + (c2 - '0') + tmp == 2) {
                tmp = 1;
                sb.append('0');
            } else if ((c1 - '0') + (c2 - '0') + tmp == 3) {
                tmp = 1;
                sb.append('1');
            } else if ((c1 - '0') + (c2 - '0') + tmp == 1) {
                tmp = 0;
                sb.append('1');
            } else {
                tmp = 0;
                sb.append('0');
            }
        }
        if (tmp == 1) sb.append('1');
        return sb.reverse().toString();
    }

}
