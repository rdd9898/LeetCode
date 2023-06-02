package daily_practice.may_2023.day23.offer_ii_049;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 049. 从根节点到叶节点的路径数字之和
 * @author: Mr.Hu
 * @create: 2023-05-23 21:22
 **/
public class Solution {

    public class TreeNode {
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

    int res = 0;

    public int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return res;
    }

    private void dfs(TreeNode node, int prev) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            prev = prev * 10 + node.val;
            res += prev;
        }
        prev = prev * 10 + node.val;
        dfs(node.left, prev);
        dfs(node.right, prev);
    }

}
