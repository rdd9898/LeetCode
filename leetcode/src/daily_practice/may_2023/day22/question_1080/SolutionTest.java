package daily_practice.may_2023.day22.question_1080;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void sufficientSubset() {

        Solution.TreeNode node1 = new Solution.TreeNode(1);
        Solution.TreeNode node2 = new Solution.TreeNode(2);
        Solution.TreeNode node3 = new Solution.TreeNode(3);
        Solution.TreeNode node4 = new Solution.TreeNode(4);
        Solution.TreeNode node5 = new Solution.TreeNode(-99);
        Solution.TreeNode node6 = new Solution.TreeNode(-99);
        Solution.TreeNode node7 = new Solution.TreeNode(7);
        Solution.TreeNode node8 = new Solution.TreeNode(8);
        Solution.TreeNode node9 = new Solution.TreeNode(9);
        Solution.TreeNode node10 = new Solution.TreeNode(-99);
        Solution.TreeNode node11 = new Solution.TreeNode(-99);
        Solution.TreeNode node12 = new Solution.TreeNode(12);
        Solution.TreeNode node13 = new Solution.TreeNode(13);
        Solution.TreeNode node14 = new Solution.TreeNode(-99);
        Solution.TreeNode node15 = new Solution.TreeNode(14);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node4.left = node8;
        node4.right = node9;
        node5.left = node10;
        node5.right = node11;
        node6.left = node12;
        node6.right = node13;
        node7.left = node14;
        node7.right = node15;
        Solution solution = new Solution();
        solution.sufficientSubset(node1, 1);
    }
}