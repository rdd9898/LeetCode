package daily_practice.may_2023.day31.offer_ii_054;

import static jdk.nashorn.api.scripting.ScriptUtils.convert;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 054. 所有大于等于节点的值之和
 * @author: Mr.Hu
 * @create: 2023-05-31 21:02
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

    int sum = 0;
    int cur = 0;

    public TreeNode convertBST(TreeNode root) {
        dfs(root);
        convertTree(root);
        return root;
    }

    private void convertTree(TreeNode node) {
        if (node == null) return;
        convertTree(node.left);
        int tmp = sum - cur;
        cur += node.val;
        node.val = tmp;
        convertTree(node.right);

    }

    private void dfs(TreeNode node) {
        if (node == null) return;
        sum += node.val;
        dfs(node.left);
        dfs(node.right);
    }
}
