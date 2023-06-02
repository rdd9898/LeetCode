package daily_practice.april_2023.day20.offer_15;

import daily_practice.april_2023.day20.offer_15.Solution;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void hammingWeight() {

        int n = 11;
        Solution solution = new Solution();
        int ans = solution.hammingWeight(n);
        System.out.println(ans);

    }
}