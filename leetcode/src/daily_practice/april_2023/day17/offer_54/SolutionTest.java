package daily_practice.april_2023.day17.offer_54;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void kthLargest() {
        Solution.TreeNode node1 = new Solution.TreeNode(5);
        Solution.TreeNode node2 = new Solution.TreeNode(3);
        Solution.TreeNode node3 = new Solution.TreeNode(6);
        Solution.TreeNode node4 = new Solution.TreeNode(2);
        Solution.TreeNode node5 = new Solution.TreeNode(4);
        Solution.TreeNode node6 = new Solution.TreeNode(1);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node4.left = node6;
        Solution solution = new Solution();
        solution.kthLargest(node1, 3);
    }
}