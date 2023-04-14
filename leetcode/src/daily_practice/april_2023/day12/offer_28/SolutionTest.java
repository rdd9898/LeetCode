package daily_practice.april_2023.day12.offer_28;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isSymmetric() {
        Solution solution = new Solution();
        Solution.TreeNode node1 = new Solution.TreeNode(1);
        Solution.TreeNode node2 = new Solution.TreeNode(2);
        Solution.TreeNode node3 = new Solution.TreeNode(2);
        Solution.TreeNode node4 = new Solution.TreeNode(3);
        Solution.TreeNode node5 = new Solution.TreeNode(4);
        Solution.TreeNode node6 = new Solution.TreeNode(4);
        Solution.TreeNode node7 = new Solution.TreeNode(3);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        boolean symmetric = solution.isSymmetric(node1);
        System.out.println(symmetric);
    }
}