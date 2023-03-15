package daily_practice.march_2023.day15.question_104;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: LeetCode
 * @description: 104.二叉树的最大深度
 * @author: Mr.Hu
 * @create: 2023-03-15 17:05
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

    public int maxDepth(TreeNode root) {
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
            if (cur.left != null) {
                deque.offerLast(cur.left);
                tempSize++;
            }
            if (cur.right != null) {
                deque.offerLast(cur.right);
                tempSize++;
            }
            if (size == 0) {
                size = tempSize;
                tempSize = 0;
            }
        }
        return ans;
    }

}
