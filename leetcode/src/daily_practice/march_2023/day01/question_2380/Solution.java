package daily_practice.march_2023.day01.question_2380;

/**
 * @program: LeetCode
 * @description: 2380.二进制字符串重新安排顺序需要的时间
 * @author: Mr.Hu
 * @create: 2023-03-01 21:58
 **/
public class Solution {

    public int secondsToRemoveOccurrences(String s) {
        int second = 0;
        int length = s.length();
        if (length == 1) return second;
        StringBuffer sb = new StringBuffer(s);
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < length - 1; i++) {
                if (sb.charAt(i) == '0' && sb.charAt(i + 1) == '1') {
                    sb.replace(i, i + 2, "10");
                    i++;
                    flag = true;
                }
            }
            second++;
        }
        second--;
        return second;
    }

}
