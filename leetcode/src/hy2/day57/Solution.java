package hy2.day57;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description:
 * @date 2022年03月31日 9:54
 */
public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> answers = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            String s = String.valueOf(i);
            char[] chars = s.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == '0') {
                    break;
                } else {
                    if (i % Integer.parseInt(String.valueOf(chars[j])) != 0) {
                        break;
                    }
                }
                if (j == chars.length-1) {
                    answers.add(i);
                }
            }
        }
        return answers;
    }
}
