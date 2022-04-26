package hy.day41;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description:
 * @date 2022年03月07日 9:39
 */
public class Solution {
    public static String convertToBase7(int num) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean flag = false;
        if (num < 0) {
            num = -num;
            flag = true;
        }
        while (num >= 7) {
            int a = num % 7;
            num = num / 7;
            stringBuffer.append(a);
        }
        stringBuffer.append(num);
        if (flag) {
            stringBuffer.append("-");
        }
        return stringBuffer.reverse().toString();
    }
}
