package daily_practice.may_2023.day30.offer_ii_053;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 053. 二叉搜索树中的中序后继
 * @author: Mr.Hu
 * @create: 2023-05-30 20:16
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

    TreeNode res;
    boolean flag = false;

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        dfs(root, p);
        return res;
    }

    private void dfs(TreeNode node, TreeNode p) {
        if (node == null) return;
        dfs(node.left, p);
        if (flag) {
            res = node;
            flag = false;
            return;
        }
        if (node == p) {
            flag = true;
        }
        dfs(node.right, p);
    }
}
