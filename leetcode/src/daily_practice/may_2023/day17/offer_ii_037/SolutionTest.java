package daily_practice.may_2023.day17.offer_ii_037;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void asteroidCollision() {
        int[] asteroids = {1, -1, -2, -2};
        Solution solution = new Solution();
        int[] ans = solution.asteroidCollision(asteroids);
        for (int an : ans) {
            System.out.println(an);
        }
    }
}