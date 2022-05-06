package daily_practice.undefined_2022.hy3.day27;

/**
 * @author ：HuYang
 * @date ：Created in 2022/2/24 0:23
 * @description：
 * @modified By：
 * @version: $
 */
public class Test {
    public static void main(String[] args) {
        int[][] grid = {{1,1,1,1,1,1},{-1,-1,-1,-1,-1,-1},{1,1,1,1,1,1},{-1,-1,-1,-1,-1,-1}};
        int[] ans = Solution.findBall(grid);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
