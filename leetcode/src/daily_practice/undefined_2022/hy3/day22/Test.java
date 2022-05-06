package daily_practice.undefined_2022.hy3.day22;

import java.util.List;

/**
 * @author ：HuYang
 * @date ：Created in 2022/2/15 19:02
 * @description：
 * @modified By：
 * @version: $
 */
public class Test {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> integers = Solution.luckyNumbers(matrix);
        integers.forEach(System.out::println);
    }
}
