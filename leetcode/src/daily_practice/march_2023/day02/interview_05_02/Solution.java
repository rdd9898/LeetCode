package daily_practice.march_2023.day02.interview_05_02;

/**
 * @program: LeetCode
 * @description: 面试题05.02.二进制数转字符串
 * @author: Mr.Hu
 * @create: 2023-03-02 20:15
 **/
public class Solution {

    public String printBin(double num) {
        StringBuffer sb = new StringBuffer("0.");
        double bit = 0.5;
        while (num != 0 && sb.length() <= 34) {
            if (num >= bit) {
                sb.append("1");
                num -= bit;
            }
            else {
                sb.append("0");
            }
            bit /= 2;
        }
        if (num != 0) return "ERROR";
        else return sb.toString();
    }

}
