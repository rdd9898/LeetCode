package hy2.day56;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void busiestServers() {
        int k = 3;
        int[] arrival = {1, 2, 3, 4, 5};
        int[] load = {5, 2, 3, 3, 3};
        Solution solution = new Solution();
        List<Integer> ans = solution.busiestServers(k, arrival, load);
        ans.forEach(System.out::println);
    }
}