package hy2.day62;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findMinHeightTrees() {
        int n = 4;
        int[][] edges = {{1, 0}, {1, 2}, {1, 3}};
        Solution solution = new Solution();
        List<Integer> answers = solution.findMinHeightTrees(n, edges);
        answers.forEach(System.out::println);
    }
}