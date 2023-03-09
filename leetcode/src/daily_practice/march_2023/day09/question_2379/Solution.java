package daily_practice.march_2023.day09.question_2379;

/**
 * @program: LeetCode
 * @description: 2379.得到 K 个黑块的最少涂色次数
 * @author: Mr.Hu
 * @create: 2023-03-09 19:43
 * @method: 使用滑动窗口方法
 **/
public class Solution {

    public int minimumRecolors(String blocks, int k) {
        int ans = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') ans++;
        }
        int temp = ans;
        for (int i = 0, j = k; j < blocks.length(); i++, j++) {
            if (blocks.charAt(i) == 'W') temp--;
            if (blocks.charAt(j) == 'W') temp++;
            ans = Integer.min(ans, temp);
        }
        return ans;
    }

}
