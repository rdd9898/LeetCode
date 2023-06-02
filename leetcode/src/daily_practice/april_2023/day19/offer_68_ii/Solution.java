package daily_practice.april_2023.day19.offer_68_ii;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 68 - II. 二叉树的最近公共祖先
 * @author: Mr.Hu
 * @create: 2023-04-19 20:56
 **/
public class Solution {

    static public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    TreeNode ans = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return ans;
    }

    private boolean dfs(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) return false;
        boolean flag = node == p || node == q;
        boolean flag1 = dfs(node.left, p, q);
        boolean flag2 = dfs(node.right, p, q);
        if (ans == null && flag1 && flag2) {
            ans = node;
        } else if (ans == null && flag && flag2) {
            ans = node;
        } else if (ans == null && flag && flag1) {
            ans = node;
        }
        return flag || flag1 || flag2;
    }
    
}
