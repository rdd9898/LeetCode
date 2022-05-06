package daily_practice.undefined_2022.hy3.day31;

/**
 * @author ：HuYang
 * @date ：Created in 2022/3/24 10:00
 * @description：
 * @modified By：
 * @version: $
 */
public class Test {

    public static void main(String[] args) {
        int[][] img = {{100,200,100},{200,50,200},{100,200,100}};
        int[][] ints = Solution.imageSmoother(img);
        for (int[] ans: ints) {
            for (int a: ans) {
                System.out.print(a);
                System.out.print(",");
            }
            System.out.println();
        }
    }

}
