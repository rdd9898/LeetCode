package daily_practice.april_2023.day19.offer_68_i;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 68 - I. 二叉搜索树的最近公共祖先
 * @author: Mr.Hu
 * @create: 2023-04-19 20:47
 **/
public class Solution {

     static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while ((root.val < p.val && root.val < q.val) || (root.val > p.val && root.val > q.val)) {
            if (root.val > p.val) root = root.left;
            else root = root.right;
        }
        return root;
    }

}
