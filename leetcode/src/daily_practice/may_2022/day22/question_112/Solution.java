package daily_practice.may_2022.day22.question_112;

import daily_practice.may_2022.day22.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 112.路径总和
 * @date 2022年05月22日 11:03
 */
public class Solution {

    public boolean hasPathSum(TreeNode root, int targetSum) {

        List<Integer> list = new ArrayList<>();
        int pathSum = 0;
        dfs(root, pathSum, list);
        return list.contains(targetSum);

    }

    private void dfs(TreeNode node, int pathSum, List<Integer> list) {
        if (node == null) {
            return;
        }
        pathSum += node.val;
        if (node.left == null && node.right == null) {
            list.add(pathSum);
        } else {
            dfs(node.left, pathSum, list);
            dfs(node.right, pathSum, list);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(11);
        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(8);
        TreeNode node6 = new TreeNode(13);
        TreeNode node7 = new TreeNode(4);
        TreeNode node8 = new TreeNode(1);
        root.left = node1;
        root.right = node5;
        node1.left = node2;
        node2.left = node3;
        node2.right = node4;
        node5.left = node6;
        node5.right = node7;
        node7.right = node8;
        Solution solution = new Solution();
        boolean ans = solution.hasPathSum(root, 22);
    }

}
