package daily_practice.may_2022.day20.question_94;

import java.util.ArrayList;
import java.util.List;

/**
 * 递归实现
 * @author 胡阳
 * @ClassName Solution
 * @description: 94.二叉树的中序遍历
 * @date 2022年05月20日 10:10
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;
    }

    private void inorder(TreeNode node, List<Integer> ans) {

        if (node == null) {
            return;
        }

        inorder(node.left, ans);
        ans.add(node.val);
        inorder(node.right, ans);

    }

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
}
