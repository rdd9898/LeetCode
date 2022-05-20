package daily_practice.may_2022.day20.question_145;

import java.util.ArrayList;
import java.util.List;

/**
 * 递归实现
 * @author 胡阳
 * @ClassName Solution
 * @description: 145.二叉树的后序遍历
 * @date 2022年05月20日 10:19
 */
public class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        post(root, ans);
        return ans;

    }

    private void post(TreeNode node, List<Integer> ans) {

        if (node == null) {
            return;
        }

        post(node.left, ans);
        post(node.right, ans);
        ans.add(node.val);

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
