package daily_practice.march_2023.day22.question_844;

/**
 * @program: LeetCode
 * @description: 844.比较含退格的字符串
 * @author: Mr.Hu
 * @create: 2023-03-22 20:55
 **/
public class Solution {

    public boolean backspaceCompare(String s, String t) {
        int length1 = s.length();
        int length2 = t.length();
        int length = Integer.max(length1, length2);
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        for (int i = 0; i < length; i++) {
            if (i < length1) {
                if (s.charAt(i) == '#') {
                    if (sb1.length() > 0)
                        sb1.deleteCharAt(sb1.length() - 1);
                }
                else sb1.append(s.charAt(i));
            }
            if (i < length2) {
                if (t.charAt(i) == '#') {
                    if (sb2.length() > 0)
                        sb2.deleteCharAt(sb2.length() - 1);
                }
                else sb2.append(t.charAt(i));
            }
        }
        return sb1.toString().equals(sb2.toString());
    }

}
