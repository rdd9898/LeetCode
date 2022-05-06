package daily_practice.undefined_2022.hy3.day10;

/**
 * @author ：HuYang
 * @date ：Created in 2022/1/29 10:09
 * @description：
 * @modified By：
 * @version: $
 */
public class Test {
    public static void main(String[] args) {
        int[][] isWater = {{0,0,1},{1,0,0},{0,0,0}};
        int[][] ints = Solution.highestPeak(isWater);
        for (int[] i: ints) {
            for (int j: i) {
                System.out.print(j);
                System.out.print(",");
            }
            System.out.println();
        }
    }
}
