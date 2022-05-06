package daily_practice.undefined_2022.hy3.day19;

/**
 * @author ：HuYang
 * @date ：Created in 2022/2/12 11:08
 * @description：
 * @modified By：
 * @version: $
 */
public class Test {
    public static void main(String[] args) {
        int[][] grid = {{0,1,1,0}, {0,0,1,0}, {0,0,1,0}, {0,0,0,0}};
        int answer = Solution.numEnclaves(grid);
        System.out.println(answer);
    }
}
