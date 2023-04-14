package daily_practice.april_2023.day11.offer_05;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 05. 替换空格
 * @author: Mr.Hu
 * @create: 2023-04-11 21:20
 **/
public class Solution {

    public String replaceSpace(String s) {
        StringBuffer sb = new StringBuffer();
        for (char c : s.toCharArray()) {
            if (c == ' ') sb.append("%20");
            else sb.append(c);
        }
        return sb.toString();
    }

}
