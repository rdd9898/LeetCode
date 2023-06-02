package daily_practice.may_2023.day05.question_2432;

/**
 * @program: LeetCode
 * @description: 2432. 处理用时最长的那个任务的员工
 * @author: Mr.Hu
 * @create: 2023-05-05 16:06
 **/
public class Solution {

    public int hardestWorker(int n, int[][] logs) {
        int ans = logs[0][0];
        int start = logs[0][1];
        int time = logs[0][1];
        for (int i = 1; i < logs.length; i++) {
            if (logs[i][1] - start > time) {
                ans = logs[i][0];
                time = logs[i][1] - start;
            } else if (logs[i][1] - start == time) {
                ans = Integer.min(ans, logs[i][0]);
            }
            start = logs[i][1];
        }
        return ans;
    }

}
