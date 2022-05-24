package daily_practice.may_2022.day24.question_658;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findClosestElements() {

        int[] arr = {1,1,1,10,10,10};
        int k = 1;
        int x = 9;
        Solution solution = new Solution();
        List<Integer> ans = solution.findClosestElements(arr, k, x);
        ans.forEach(System.out::println);

    }
}