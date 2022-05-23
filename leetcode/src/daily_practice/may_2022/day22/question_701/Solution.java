package daily_practice.may_2022.day22.question_701;

import daily_practice.may_2022.day22.TreeNode;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 701.二叉搜索树中的插入操作
 * @date 2022年05月22日 11:35
 */
public class Solution {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            TreeNode node = new TreeNode(val);
            root = node;
            return root;
        }
        insert(root, val);
        return root;
    }
    private TreeNode insert(TreeNode node, int val) {
        if (val < node.val) {
            if (node.left == null) {
                TreeNode tmp = new TreeNode(val);
                node.left = tmp;
                return node;
            }
            return insertIntoBST(node.left, val);
        } else {
            if (node.right == null) {
                TreeNode tmp = new TreeNode(val);
                node.right = tmp;
                return node;
            }
            return insertIntoBST(node.right, val);
        }
    }

}
