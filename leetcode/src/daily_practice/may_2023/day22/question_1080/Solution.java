package daily_practice.may_2023.day22.question_1080;

/**
 * @program: LeetCode
 * @description: 1080. 根到叶路径上的不足节点
 * @author: Mr.Hu
 * @create: 2023-05-22 19:57
 **/
public class Solution {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode sufficientSubset(TreeNode root, int limit) {
        boolean ans = dfs(root, 0, limit);
        return ans ? root : null;
    }

    private boolean dfs(TreeNode node, int sum, int limit) {
        if (node == null) return false;
        if (node.left == null && node.right == null) {
            return sum + node.val >= limit;
        }
        boolean left = dfs(node.left, sum + node.val, limit);
        boolean right = dfs(node.right, sum + node.val, limit);
        if (!left) {
            node.left = null;
        }
        if (!right) {
            node.right = null;
        }
        return left || right;
    }

}
