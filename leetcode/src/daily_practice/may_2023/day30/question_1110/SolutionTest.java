package daily_practice.may_2023.day30.question_1110;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void delNodes() {
        Solution.TreeNode node1 = new Solution.TreeNode(1);
        Solution.TreeNode node2 = new Solution.TreeNode(2);
        Solution.TreeNode node3 = new Solution.TreeNode(3);
        Solution.TreeNode node4 = new Solution.TreeNode(4);
        node1.left = node2;
        node1.right = node3;
        node3.right = node4;
        Solution solution = new Solution();
        int[] to_delete = {2, 1};
        solution.delNodes(node1, to_delete);
    }
}