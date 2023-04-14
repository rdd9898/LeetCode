package daily_practice.april_2023.day12.offer_27;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 27. 二叉树的镜像
 * @author: Mr.Hu
 * @create: 2023-04-12 16:58
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

    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode ans = new TreeNode(root.val);
        dfs(root, ans);
        return ans;
    }

    private void dfs(TreeNode root1, TreeNode root2) {
        if (root1.left != null) {
            root2.right = new TreeNode(root1.left.val);
            dfs(root1.left, root2.right);
        }
        if (root1.right != null) {
            root2.left = new TreeNode(root1.right.val);
            dfs(root1.right, root2.left);
        }
    }

}
