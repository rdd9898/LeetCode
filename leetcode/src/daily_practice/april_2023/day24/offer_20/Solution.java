package daily_practice.april_2023.day24.offer_20;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 20. 表示数值的字符串
 * @author: Mr.Hu
 * @create: 2023-04-24 10:45
 **/
public class Solution {

    public boolean isNumber(String s) {
        int i = 0;
        int length = s.length();
        boolean numberFlag = false;
        boolean scienceFlag = false;
        boolean scienceNumberFlag = false;
        while (i < length && s.charAt(i) == ' ') i++;
        if (i < length && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            i++;
        }
        while (i < length && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            i++;
            numberFlag = true;
        }
        if (i < length && s.charAt(i) == '.') {
            i++;
        }
        while (i < length && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            i++;
            numberFlag = true;
        }
        if (numberFlag && i < length && (s.charAt(i) == 'e' || s.charAt(i) == 'E')) {
            i++;
            scienceFlag = true;
        }
        if (numberFlag && scienceFlag && i < length && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            i++;
        }
        while (numberFlag && scienceFlag && i < length && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            i++;
            scienceNumberFlag = true;
        }
        while (numberFlag &&i < length && s.charAt(i) == ' ') i++;

        return numberFlag && i == length && !(scienceNumberFlag ^ scienceFlag);
    }

}
