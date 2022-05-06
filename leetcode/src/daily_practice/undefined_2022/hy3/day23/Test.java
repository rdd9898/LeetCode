package daily_practice.undefined_2022.hy3.day23;

/**
 * @author ：HuYang
 * @date ：Created in 2022/2/18 16:37
 * @description：
 * @modified By：
 * @version: $
 */
public class Test {
    public static void main(String[] args) {
        int[][] edges = {{1,2},{5,1},{1,3},{1,4}};
        int answer = Solution.findCenter(edges);
        System.out.println(answer);
    }
}
