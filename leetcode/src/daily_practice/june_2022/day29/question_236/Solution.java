package daily_practice.june_2022.day29.question_236;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description:
 * @date 2022年06月29日 10:10
 */
public class Solution {

    TreeNode ans = new TreeNode();

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q, 0);
        return ans;
    }

    public int dfs(TreeNode node, TreeNode p, TreeNode q, int flag) {
        if (node == null) {
            return 0;
        }
        int temp = 0;
        if (node == p || node == q) {
            temp++;
        }
        int res = dfs(node.left, p, q, flag) + dfs(node.right, p, q, flag) + temp;
        if (res == 2) {
            ans = node;
            res++;
        }
        return res;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {

        }

        TreeNode(int x) {
            val = x;
        }
    }

}
