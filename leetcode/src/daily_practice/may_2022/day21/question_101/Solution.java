package daily_practice.may_2022.day21.question_101;


/**
 * 递归实现
 * @author 胡阳
 * @ClassName Solution
 * @description: 101.对称二叉树
 * @date 2022年05月22日 9:23
 */
public class Solution {

    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    private boolean check(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }

        return node1.val == node2.val && check(node1.left, node2.right) && check(node1.right, node2.left);

    }

    private class TreeNode {
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

}
