package daily_practice.may_2022.day23.question_235;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 235.二叉搜索树的最近公共祖先
 * @date 2022年05月23日 10:10
 */
public class Solution {

    boolean flag = false;
    TreeNode ansRoot = new TreeNode(0);

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        search(root, p, q);
        return ansRoot;

    }

    private int search(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) {
            return 0;
        }
        if (node == p || node == q) {
            int ans = search(node.left, p, q) + search(node.right, p, q) + 1;
            if (ans == 2 && !flag) {
                ansRoot = node;
                flag = true;
            }
            return 1;
        }

        int ans = search(node.left, p, q) + search(node.right, p, q);
        if (ans == 2 && !flag) {
            ansRoot = node;
            flag = true;
        }

        return ans;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
