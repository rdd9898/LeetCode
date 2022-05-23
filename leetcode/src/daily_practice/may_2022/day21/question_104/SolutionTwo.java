package daily_practice.may_2022.day21.question_104;

/**
 * 深度优先遍历
 * @author 胡阳
 * @ClassName SolutionTwo
 * @description: 104.二叉树的最大深度
 * @date 2022年05月22日 10:33
 */
public class SolutionTwo {

    int ans = 0;

    public int maxDepth(TreeNode root) {
        int tmp = 0;
        search(root, tmp);
        return ans;
    }

    private void search(TreeNode node, int tmp) {
        if (node == null) {
            return;
        }
        tmp++;
        search(node.left, tmp);
        search(node.right, tmp);
        if (tmp > ans) {
            ans = tmp;
        }
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
