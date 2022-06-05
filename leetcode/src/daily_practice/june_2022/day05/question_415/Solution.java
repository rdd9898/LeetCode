package daily_practice.june_2022.day05.question_415;

/**
 * @program: LeetCode
 * @description: 415.字符串相加
 * @author: Mr.Hu
 * @create: 2022-06-05 12:00
 **/
public class Solution {

    public String addStrings(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();
        StringBuffer sb = new StringBuffer();
        boolean flag = false;
        for (int i1 = n1 - 1, i2 = n2 - 1 ; i1 >= 0 || i2 >= 0; i1--, i2--) {
            int i = 0;
            if (i1 >= 0 && i2 >= 0) {
                i = (num1.charAt(i1) - '0') + (num2.charAt(i2) - '0');
                if (flag) i++;
                if (i > 9) {
                    flag = true;
                    i -= 10;
                } else {
                    flag = false;
                }
                sb.append(i);
            } else if (i1 >= 0) {
                i = (num1.charAt(i1) - '0');
                if (flag) i++;
                if (i > 9) {
                    flag = true;
                    i -= 10;
                } else {
                    flag = false;
                }
                sb.append(i);
            } else if (i2 >= 0) {
                i = (num2.charAt(i2) - '0');
                if (flag) i++;
                if (i > 9) {
                    flag = true;
                    i -= 10;
                } else {
                    flag = false;
                }
                sb.append(i);
            }
        }
        if (flag) {
            sb.append('1');
        }
        String s = sb.toString();
        StringBuffer ans = new StringBuffer();
        for (int i = s.length() - 1; i >= 0; i--) {
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }

}
