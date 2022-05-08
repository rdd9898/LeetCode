package daily_practice.may_2022.day08.question_242;

import java.util.Arrays;

/**
 * 先变成数组进行排序，然后判断是否相等
 * @author 胡阳
 * @ClassName SolutionTwo
 * @description: 242.有效的字母异位词
 * @date 2022年05月08日 10:23
 */
public class SolutionTwo {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }

}
