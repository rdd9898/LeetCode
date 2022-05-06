package daily_practice.undefined_2022.hy2.day51;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 2038.如果相邻两个颜色均相同则删除当前颜色
 * @date 2022年03月22日 14:32
 */
public class Solution {
    public boolean winnerOfGame(String colors) {
        char[] chars = colors.toCharArray();
        int numA = 0;
        int numB = 0;
        for (int i = 0; i < chars.length - 2; i++) {
            if (chars[i] == chars[i+1] && chars[i+2] == chars[i]) {
                if (chars[i] == 'A') {
                    numA++;
                } else {
                    numB++;
                }
            }
        }
        if (numA <= numB) {
            return false;
        }
        return true;
    }
}
