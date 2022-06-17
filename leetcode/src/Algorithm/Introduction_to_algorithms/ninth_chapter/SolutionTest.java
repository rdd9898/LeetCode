package Algorithm.Introduction_to_algorithms.ninth_chapter;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minimum() {

        int[] arr = {2,5,1,7,9,12,3};
        Solution solution = new Solution();
        int ans = solution.minimum(arr);
        System.out.println(ans);

    }
}