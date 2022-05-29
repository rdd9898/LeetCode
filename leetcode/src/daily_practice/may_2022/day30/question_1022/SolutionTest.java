package daily_practice.may_2022.day30.question_1022;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void sumRootToLeaf() {
        Solution.TreeNode treeNode = new Solution.TreeNode(1);
        Solution.TreeNode treeNode1 = new Solution.TreeNode(0);
        Solution.TreeNode treeNode2 = new Solution.TreeNode(0);
        Solution.TreeNode treeNode3 = new Solution.TreeNode(1);
        Solution.TreeNode treeNode4 = new Solution.TreeNode(1);
        Solution.TreeNode treeNode5 = new Solution.TreeNode(0);
        Solution.TreeNode treeNode6 = new Solution.TreeNode(1);
//        treeNode.left = treeNode1;
//        treeNode1.left = treeNode2;
//        treeNode1.right = treeNode3;
//        treeNode.right = treeNode4;
//        treeNode4.left = treeNode5;
//        treeNode4.right = treeNode6;
        treeNode.left = treeNode3;
        Solution solution = new Solution();
        int ans = solution.sumRootToLeaf(treeNode);
        System.out.println(ans);
    }
}