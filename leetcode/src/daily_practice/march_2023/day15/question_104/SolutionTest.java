package daily_practice.march_2023.day15.question_104;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxDepth() {
        Solution solution = new Solution();
        Solution.TreeNode node1 = new Solution.TreeNode(15);
        Solution.TreeNode node2 = new Solution.TreeNode(7);
        Solution.TreeNode node3 = new Solution.TreeNode(20, node1, node2);
        Solution.TreeNode node4 = new Solution.TreeNode(9);
        Solution.TreeNode root = new Solution.TreeNode(3, node4, node3);
        int ans = solution.maxDepth(root);
        System.out.println(ans);
    }
}