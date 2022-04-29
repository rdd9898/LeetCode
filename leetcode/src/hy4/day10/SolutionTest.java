package hy4.day10;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void construct() {

        int[][] grid = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        Solution solution = new Solution();
        Node root = solution.construct(grid);
        System.out.println(root.val);
        System.out.println(root.isLeaf);

    }
}