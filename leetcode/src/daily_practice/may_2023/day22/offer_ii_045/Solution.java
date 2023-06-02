package daily_practice.may_2023.day22.offer_ii_045;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 045. 二叉树最底层最左边的值
 * @author: Mr.Hu
 * @create: 2023-05-22 21:01
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

    public int findBottomLeftValue(TreeNode root) {
        int ans = root.val;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int size = 1;
        int tmpSize = 0;
        while (!queue.isEmpty()) {
            size--;
            TreeNode cur = queue.poll();
            if (cur.left != null) {
                tmpSize++;
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                tmpSize++;
                queue.offer(cur.right);
            }
            if (size == 0) {
                if (!queue.isEmpty()) ans = queue.peek().val;
                size = tmpSize;
                tmpSize = 0;
            }
        }
        return ans;
    }
}
