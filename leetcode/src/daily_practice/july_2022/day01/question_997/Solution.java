package daily_practice.july_2022.day01.question_997;

/**
 * @program: LeetCode
 * @description: 997.找到小镇的法官
 * @author: Mr.Hu
 * @create: 2022-07-01 10:53
 **/
public class Solution {

    public int findJudge(int n, int[][] trust) {
        int[] tickets = new int[n];
        boolean[] flag = new boolean[n];
        for (int[] temps: trust) {
            tickets[temps[1] - 1]++;
            flag[temps[0] - 1] = true;
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (tickets[i] == n - 1 && !flag[i]) {
                ans = i + 1;
            }
        }
        return ans;
    }

}
