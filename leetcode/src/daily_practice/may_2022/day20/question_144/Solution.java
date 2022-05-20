package daily_practice.may_2022.day20.question_144;

import java.util.ArrayList;
import java.util.List;

/**
 * 递归算法实现
 * @author 胡阳
 * @ClassName Solution
 * @description: 144.二叉树的前序遍历
 * @date 2022年05月20日 9:58
 */
public class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        pre(root, ans);
        return ans;

    }

    private void pre(TreeNode node, List<Integer> ans) {
        if (node == null) {
            return;
        }

        ans.add(node.val);
        pre(node.left, ans);
        pre(node.right, ans);
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
