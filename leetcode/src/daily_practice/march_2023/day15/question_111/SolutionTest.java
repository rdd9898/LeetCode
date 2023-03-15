package daily_practice.march_2023.day15.question_111;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minDepth() {
        Solution solution = new Solution();
        Solution.TreeNode node1 = new Solution.TreeNode(6);
        Solution.TreeNode node2 = new Solution.TreeNode(5, null, node1);
        Solution.TreeNode node3 = new Solution.TreeNode(4, null, node2);
        Solution.TreeNode node4 = new Solution.TreeNode(3, null, node3);
        Solution.TreeNode root = new Solution.TreeNode(2, null, node4);
        int ans = solution.minDepth(root);
        System.out.println(ans);
    }
}