package daily_practice.may_2022.day23.question_98;

/**
 * 递归实现
 * @author 胡阳
 * @ClassName SolutionTwo
 * @description: 98.验证二叉搜索树
 * @date 2022年05月23日 9:35
 */
public class SolutionTwo {

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode node, long minValue, long maxValue) {
        if (node == null) {
            return true;
        }

        if (node.val <= minValue || node.val >= maxValue) {
            return false;
        }

        return isValidBST(node.left, minValue, node.val) && isValidBST(node.right, node.val, maxValue);
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
