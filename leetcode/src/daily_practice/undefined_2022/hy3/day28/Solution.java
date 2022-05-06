package daily_practice.undefined_2022.hy3.day28;

/**
 * @author ：HuYang
 * @date ：Created in 2022/2/25 0:03
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public static String complexNumberMultiply(String num1, String num2) {

        String[] split1 = num1.split("\\+|i");
        String[] split2 = num2.split("\\+|i");

        int real1 = Integer.parseInt(split1[0]);
        int imag1 = Integer.parseInt(split1[1]);
        int real2 = Integer.parseInt(split2[0]);
        int imag2 = Integer.parseInt(split2[1]);

        String ans = String.format("%d+%di", real1 * real2 - imag1 * imag2, real1 * imag2 + real2 * imag1);

        return ans;
    }
}
