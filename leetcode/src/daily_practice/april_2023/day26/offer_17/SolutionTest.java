package daily_practice.april_2023.day26.offer_17;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void printNumbers() {
        int n = 4;
        Solution solution = new Solution();
        int[] ints = solution.printNumbers(n);
        for (int i : ints) {
            System.out.println(i);
        }
    }
}