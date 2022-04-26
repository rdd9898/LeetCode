package hy2.day69;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description:
 * @date 2022年04月23日 9:07
 */
public class Solution {

    public int[][] outerTrees(int[][] trees) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] left = {Integer.MAX_VALUE, 0};
        int[] right = {Integer.MIN_VALUE, 0};
        int[] up = {0, Integer.MIN_VALUE};
        int[] down = {0, Integer.MAX_VALUE};

        for (int[] tree : trees) {
            if (tree[0] > right[0]) {
                right[0] = tree[0];
                right[1] = tree[1];
            }
            if (tree[0] < left[0]) {
                left[0] = tree[0];
                left[1] = tree[1];
            }
            if (tree[1] > up[1]) {
                up[0] = tree[0];
                up[1] = tree[1];
            }
            if (tree[1] < down[1]) {
                down[0] = tree[0];
                down[1] = tree[1];
            }
        }

        return trees;
    }

}
