package daily_practice.june_2022.day27.question_230;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 230.二叉搜索树中第 K 小的元素
 * @date 2022年06月27日 9:18
 */
public class Solution {

    int num = 0;
    int ans = 0;

    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return ans;
    }

    public void dfs(TreeNode node, int k) {
        if (node == null) {
            return;
        }
        dfs(node.left, k);
        num++;
        if (num == k) ans = node.val;
        dfs(node.right, k);
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
