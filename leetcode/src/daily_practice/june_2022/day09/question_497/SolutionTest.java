package daily_practice.june_2022.day09.question_497;

import org.junit.Test;

/**
 * @author 胡阳
 * @ClassName Test
 * @description:
 * @date 2022年06月09日 9:23
 */
public class SolutionTest {

    @Test
    public void test() {
        int[][] rects = {{-2,-2,1,1},{2,2,4,6}};
        Solution solution = new Solution(rects);
        int[] pick = solution.pick();
        for (int i : pick) {
            System.out.println(i);
        }
    }

}
