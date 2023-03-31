package daily_practice.march_2023.day21.question_15;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void threeSum() {
        int[] nums = {-1,0,1,2,-1,-4};
        SolutionTwo solution = new SolutionTwo();
        List<List<Integer>> lists = solution.threeSum(nums);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }
}