package daily_practice.march_2023.day06.question_1653;

/**
 * @program: LeetCode
 * @description: 1653.使字符串平衡的最少删除次数
 * @author: Mr.Hu
 * @create: 2023-03-06 19:19
 **/
public class Solution {
    /**
    * @Description: 动态规划问题，要转换思维
    * @Param: [s]
    * @return: int
    * @Author: HuYang
    * @Date: 2023/3/6
    */
    public int minimumDeletions(String s) {
        int leftA = 0;
        int rightB = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'a') rightB++;
        }
        int ans = leftA + rightB;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'b') {
                leftA++;
            } else {
                rightB--;
            }
            ans = Integer.min((leftA + rightB), ans);
        }
        return ans;
    }

}
