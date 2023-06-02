package daily_practice.may_2023.day29.offer_ii_052;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 052. 展平二叉搜索树
 * @author: Mr.Hu
 * @create: 2023-05-29 21:10
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

    TreeNode root;
    TreeNode cur;
    boolean flag = false;

    public TreeNode increasingBST(TreeNode root) {
        dfs(root);
        return this.root;
    }

    private void dfs(TreeNode node) {
        if (node == null) return;
        dfs(node.left);
        if (!flag) {
            root = new TreeNode(node.val);
            cur = root;
            flag = true;
        } else {
            TreeNode tmp = new TreeNode(node.val);
            cur.right = tmp;
            cur = tmp;
        }
        dfs(node.right);
    }
}
