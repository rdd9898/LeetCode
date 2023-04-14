package daily_practice.april_2023.day12.offer_28;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 28. 对称的二叉树
 * @author: Mr.Hu
 * @create: 2023-04-12 17:08
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

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return pd(root.left, root.right);
    }

    private boolean pd(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 == null || node2 == null) return false;
        if (node1.val != node2.val) return false;
        return pd(node1.left, node2.right) && pd(node1.right, node2.left);
    }

}
