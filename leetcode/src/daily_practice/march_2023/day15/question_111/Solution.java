package daily_practice.march_2023.day15.question_111;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: LeetCode
 * @description: 111.二叉树的最小深度
 * @author: Mr.Hu
 * @create: 2023-03-15 19:52
 **/
public class Solution {

    public static class TreeNode {
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

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int ans = 0;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offerFirst(root);
        int size = 1;
        int tempSize = 0;
        while (deque.size() != 0) {
            size--;
            if (size == 0) ans++;
            TreeNode cur = deque.pollFirst();
            if (cur.left == null && cur.right == null && size != 0) return ans + 1;
            else if (cur.left == null && cur.right == null && size == 0) return ans;
            if (cur.left != null) {
                tempSize++;
                deque.offerLast(cur.left);
            }
            if (cur.right != null) {
                tempSize++;
                deque.offerLast(cur.right);
            }
            if (size == 0) {
                size = tempSize;
                tempSize = 0;
            }
        }
        return ans;
    }

}
