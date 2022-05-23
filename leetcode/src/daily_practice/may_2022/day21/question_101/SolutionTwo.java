package daily_practice.may_2022.day21.question_101;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 迭代实现
 * @author 胡阳
 * @ClassName SolutionTwo
 * @description: 101.对称二叉树
 * @date 2022年05月22日 10:45
 */
public class SolutionTwo {

    public boolean isSymmetric(TreeNode root) {

        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.add(root);
        queue2.add(root);
        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            int n = queue1.size();
            while (n > 0) {
                TreeNode cur1 = queue1.remove();
                TreeNode cur2 = queue2.remove();
                if (cur1.val != cur2.val) {
                    return false;
                }
                if (cur1.left != null && cur2.right != null) {
                    queue1.add(cur1.left);
                    queue2.add(cur2.right);
                } else if (cur1.left != null || cur2.right != null) {
                    return false;
                }

                if (cur1.right != null && cur2.left != null) {
                    queue1.add(cur1.right);
                    queue2.add(cur2.left);
                } else if (cur1.right != null || cur2.left != null) {
                    return false;
                }

                n--;
            }
        }
        return true;

    }

    private class TreeNode {
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
