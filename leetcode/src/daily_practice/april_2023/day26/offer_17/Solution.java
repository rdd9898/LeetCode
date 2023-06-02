package daily_practice.april_2023.day26.offer_17;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 17. 打印从1到最大的n位数
 * @author: Mr.Hu
 * @create: 2023-04-26 21:50
 **/
public class Solution {

    StringBuilder sb = new StringBuilder();
    StringBuilder res = new StringBuilder();
    char[] loop = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public int[] printNumbers(int n) {
        StringBuilder sb = new StringBuilder();
        dfs(n);
        res.deleteCharAt(res.length() - 1);
        String[] strings = res.toString().split(",");
        int[] ans = new int[(int) (Math.pow(10, n) - 1)];
        for (int i = 0; i < strings.length; i++) {
            ans[i] = Integer.parseInt(strings[i]);
        }
        return ans;
    }

    private void dfs(int n) {
        if (n == 0) {
            if (Integer.parseInt(sb.toString()) != 0) {
                res.append(sb).append(",");
            }
            return;
        }
        for (int i = 0; i < 10; i++) {
            sb.append(i);
            dfs(n - 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

}
