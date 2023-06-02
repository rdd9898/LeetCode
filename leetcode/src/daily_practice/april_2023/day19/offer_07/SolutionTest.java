package daily_practice.april_2023.day19.offer_07;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void buildTree() {
        int[] preorder = {1,2,3};
        int[] inorder = {3,2,1};
        Solution solution = new Solution();
        Solution.TreeNode node = solution.buildTree(preorder, inorder);
    }
}