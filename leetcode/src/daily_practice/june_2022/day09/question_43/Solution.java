package daily_practice.june_2022.day09.question_43;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 43.字符串相乘
 * @date 2022年06月09日 10:04
 */
public class Solution {

    public String multiply(String num1, String num2) {
        if ((num2.length() == 1 && num2.charAt(0) == '0') || (num1.length() == 1 && num1.charAt(0) == '0')) return "0";
        int n = num1.length() + num2.length() - 1;
        int[] temp = new int[n];
        for (int i = 0; i < num1.length(); i++) {
            for (int j = 0; j < num2.length(); j++) {
                temp[i + j] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        int flag = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (i != 0) {
                stringBuilder.append((temp[i] + flag) % 10);
                flag = (temp[i] + flag) / 10;
            } else {
                stringBuilder.append((temp[i] + flag) % 10);
                flag = (temp[i] + flag) / 10;
                if (flag > 0) stringBuilder.append(flag);
            }
        }
        return stringBuilder.reverse().toString();
    }

}
