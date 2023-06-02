package daily_practice.april_2023.day19.offer_55_i;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 55 - I. 二叉树的深度
 * @author: Mr.Hu
 * @create: 2023-04-19 16:16
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

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int deep) {
        if (node == null) return deep;
        deep++;
        return Integer.max(dfs(node.left, deep), dfs(node.right, deep));
    }

}
