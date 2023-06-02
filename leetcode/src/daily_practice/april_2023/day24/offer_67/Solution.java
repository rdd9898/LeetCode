package daily_practice.april_2023.day24.offer_67;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 67. 把字符串转换成整数
 * @author: Mr.Hu
 * @create: 2023-04-24 21:15
 **/
public class Solution {

    public int strToInt(String str) {
        int i = 0;
        int length = str.length();
        if (length == 0) return 0;
        String max = "2147483647";
        String min = "2147483648";
        int sym = 0;
        while (i < length && !(str.charAt(i) <= '9' && str.charAt(i) >= '0') && !(str.charAt(i) == '+' || str.charAt(i) == '-')) {
            if (str.charAt(i) != ' ') return 0;
            i++;
        }
        if (i < length && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
            if (str.charAt(i) == '+') sym = 1;
            else sym = 2;
            i++;
        }
        StringBuffer sb = new StringBuffer();
        while (i < length && str.charAt(i) == '0') i++;
        while (i < length && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            sb.append(str.charAt(i));
            i++;
        }
        String ans = sb.toString();
        if (ans.length() == 0) return 0;
        if (ans.length() > 10) {
            if (sym == 2) return Integer.MIN_VALUE;
            else return Integer.MAX_VALUE;
        } else if (ans.length() == 10) {
            if (sym == 2) {
                int tmp = ans.compareTo(min);
                if (tmp >= 0) {
                    return Integer.MIN_VALUE;
                } else {
                    return -Integer.parseInt(ans);
                }
            } else {
                int tmp = ans.compareTo(max);
                if (tmp >= 0) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.parseInt(ans);
                }
            }
        } else {
            if (sym == 2) return -Integer.parseInt(ans);
            else return Integer.parseInt(ans);
        }
    }

}
