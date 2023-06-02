package daily_practice.april_2023.day26.offer_60;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void dicesProbability() {

        int n = 3;
        Solution solution = new Solution();
        double[] d = solution.dicesProbability(n);
        for (double v : d) {
            System.out.println(v);
        }

    }
}