package daily_practice.undefined_2022.hy2.day66;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 806.写字符串需要的行数
 * @date 2022年04月12日 9:39
 */
public class Solution {

    public int[] numberOfLines(int[] widths, String s) {
        int[] answers = new int[2];
        int row = 1;
        int number = 0;
        for (char c : s.toCharArray()) {
            if (number + widths[c - 'a'] > 100) {
                row++;
                number = widths[c - 'a'];
            } else {
                number += widths[c - 'a'];
            }
        }
        answers[0] = row;
        answers[1] = number;
        return answers;
    }

}
