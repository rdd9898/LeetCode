package daily_practice.may_2023.day17.offer_ii_038;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void dailyTemperatures() {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        Solution solution = new Solution();
        int[] ints = solution.dailyTemperatures(temperatures);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}