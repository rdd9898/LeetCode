package weekly_race.week_292.question_6057;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void averageOfSubtree() {

        Solution.TreeNode root = new Solution.TreeNode(4);
        Solution.TreeNode treeNode1 = new Solution.TreeNode(8);
        Solution.TreeNode treeNode2 = new Solution.TreeNode(5);
        Solution.TreeNode treeNode3 = new Solution.TreeNode(0);
        Solution.TreeNode treeNode4 = new Solution.TreeNode(1);
        Solution.TreeNode treeNode5 = new Solution.TreeNode(6);
        root.left = treeNode1;
        root.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
        treeNode2.right = treeNode5;
        Solution solution = new Solution();

        Solution.TreeNode root1 = new Solution.TreeNode(1);
        int ans = solution.averageOfSubtree(root1);
        System.out.println(ans);

    }
}