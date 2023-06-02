package daily_practice.april_2023.day19.offer_68_i;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void lowestCommonAncestor() {
        Solution.TreeNode node1 = new Solution.TreeNode(6);
        Solution.TreeNode node2 = new Solution.TreeNode(2);
        Solution.TreeNode node3 = new Solution.TreeNode(8);
        Solution.TreeNode node4 = new Solution.TreeNode(0);
        Solution.TreeNode node5 = new Solution.TreeNode(4);
        Solution.TreeNode node6 = new Solution.TreeNode(7);
        Solution.TreeNode node7 = new Solution.TreeNode(9);
        Solution.TreeNode node8 = new Solution.TreeNode(3);
        Solution.TreeNode node9 = new Solution.TreeNode(5);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node5.left = node8;
        node5.right = node9;
        Solution solution = new Solution();
        Solution.TreeNode ans = solution.lowestCommonAncestor(node1, node2, node3);
        System.out.println(ans);
    }
}