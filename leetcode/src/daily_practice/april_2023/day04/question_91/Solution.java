package daily_practice.april_2023.day04.question_91;

/**
 * @program: LeetCode
 * @description: 91.解码方法
 * @author: Mr.Hu
 * @create: 2023-04-04 22:04
 **/
public class Solution {

    public int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;
        int length = s.length();
        if (length == 1) return 1;
        int[] bp = new int[length];
        bp[0] = 1;
        int temp = Integer.parseInt(s.substring(0, 2));
        if (temp <= 26 && s.charAt(1) != '0') bp[1] = 2;
        else if (s.charAt(1) == '0' && (s.charAt(0) == '1' || s.charAt(0) == '2')) return 0;
        else bp[1] = 1;
        for (int i = 2; i < length; i++) {
            temp = Integer.parseInt(s.substring(i - 1, i + 1));
            if (s.charAt(i) == '0' && (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2')) bp[i] = bp[i - 2];
            else if (s.charAt(i) == '0') return 0;
            else if (temp < 10 || temp > 26) bp[i] = bp[i - 1];
            else bp[i] = bp[i - 1] + bp[i - 2];
        }
        return bp[length - 1];
    }

}
