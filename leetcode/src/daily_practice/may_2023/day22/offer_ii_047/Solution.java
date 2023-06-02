package daily_practice.may_2023.day22.offer_ii_047;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 047. 二叉树剪枝
 * @author: Mr.Hu
 * @create: 2023-05-22 21:20
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

    public TreeNode pruneTree(TreeNode root) {
        boolean flag = dfs(root);
        return flag ? root : null;
    }

    private boolean dfs(TreeNode node) {
        if (node == null) return false;
        if (node.left == null && node.right == null) return node.val == 1;
        boolean left = dfs(node.left);
        boolean right = dfs(node.right);
        if (!left) node.left = null;
        if (!right) node.right = null;
        return left || right || node.val == 1;
    }
}
