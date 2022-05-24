package daily_practice.may_2022.day24.question_965;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 965.单值二叉树
 * @date 2022年05月24日 9:09
 */
public class Solution {

    public boolean isUnivalTree(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = true;
        int value = root.val;
        while (!queue.isEmpty()) {
            int n = queue.size();
            while (n > 0) {
                TreeNode cur = queue.poll();
                if (cur.val != value) {
                    flag = false;
                    return flag;
                }
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
                n--;
            }
        }
        return flag;

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
