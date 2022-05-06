package daily_practice.undefined_2022.hy.day39;
// 258.个数相加
/**
 * @author 胡阳
 * @ClassName Solution
 * @description:
 * @date 2022年03月03日 10:38
 */
public class Solution {
    public static int addDigits(int num) {
        while (num >= 10) {
            String s = String.valueOf(num);
            num = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                num = num + (int)(c - '0');
            }
        }
        return num;
    }
}
