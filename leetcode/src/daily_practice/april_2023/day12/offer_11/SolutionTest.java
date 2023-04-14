package daily_practice.april_2023.day12.offer_11;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minArray() {

//        int[] numbers = {3,4,5,1,2};
//        int[] numbers = {3,4,0,1,2};
//        int[] numbers = {1,2,3,4,5};
        int[] numbers = {3,3,1,3};
        Solution solution = new Solution();
        int ans = solution.minArray(numbers);
        System.out.println(ans);

    }
}