package daily_practice.april_2023.day24.question_1163;

/**
 * @program: LeetCode
 * @description: 1163. 按字典序排在最后的子串
 * @author: Mr.Hu
 * @create: 2023-04-24 10:28
 **/
public class Solution {

    /**
    * @Description: 双指针
    * @Param: [s]
    * @return: java.lang.String
    * @Author: HuYang
    * @Date: 2023/4/24
    */
    public String lastSubstring(String s) {
        int i = 0, j = 1;
        while (j < s.length()) {
            int k = 0;
            while (j + k < s.length() && s.charAt(i + k) == s.charAt(j + k)) k++;
            if (j + k < s.length() && s.charAt(i + k) < s.charAt(j + k)) {
                int tmp = i;
                i = j;
                j = Math.max(j + 1, tmp + k + 1);
            } else {
                j = j + k + 1;
            }
        }
        return s.substring(i);
    }

}
