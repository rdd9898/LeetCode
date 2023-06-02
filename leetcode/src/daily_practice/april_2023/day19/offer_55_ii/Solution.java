package daily_practice.april_2023.day19.offer_55_ii;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 55 - II. 平衡二叉树
 * @author: Mr.Hu
 * @create: 2023-04-19 16:25
 **/
public class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    boolean ans = true;

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        dfs(root, 0);
        return ans;
    }

    private int dfs(TreeNode node, int deep) {
        if (node == null || !ans) return deep;
        deep++;
        int deepL = dfs(node.left, deep);
        int deepR = dfs(node.right, deep);
        if (Math.abs(deepL - deepR) > 1) ans = false;
        return Integer.max(deepL, deepR);
    }

}
