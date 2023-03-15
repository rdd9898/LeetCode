package daily_practice.march_2023.day15.question_515;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void largestValues() {

        Solution solution = new Solution();
        Solution.TreeNode node1 = new Solution.TreeNode(5);
        Solution.TreeNode node2 = new Solution.TreeNode(3);
        Solution.TreeNode node3 = new Solution.TreeNode(9);
        Solution.TreeNode node4 = new Solution.TreeNode(3, node1, node2);
        Solution.TreeNode node5 = new Solution.TreeNode(2, null, node3);
        Solution.TreeNode root = new Solution.TreeNode(1, node4, node5);
        List<Integer> ans = solution.largestValues(root);
        ans.forEach(System.out::println);

    }
}