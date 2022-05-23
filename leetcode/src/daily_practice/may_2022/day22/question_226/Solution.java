package daily_practice.may_2022.day22.question_226;

import daily_practice.may_2022.day22.TreeNode;

/**
 * 递归实现
 * @author 胡阳
 * @ClassName Solution
 * @description: 226.翻转二叉树
 * @date 2022年05月22日 10:50
 */
public class Solution {

    public TreeNode invertTree(TreeNode root) {
        flip(root);
        return root;
    }

    private void flip(TreeNode node) {
        if (node == null) {
            return;
        }
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;
        flip(node.left);
        flip(node.right);
    }

}
