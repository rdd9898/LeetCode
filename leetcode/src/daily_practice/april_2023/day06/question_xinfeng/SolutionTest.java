package daily_practice.april_2023.day06.question_xinfeng;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void allPossibilities() {
        Solution solution = new Solution();
        int[] nums = {3, 4, 5, 6};
//        int[] nums = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[] ints = solution.allPossibilities(nums);
        for (int i : ints) {
            System.out.println(i);
        }
    }
}