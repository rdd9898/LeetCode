package daily_practice.march_2023.day27.question_572;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: LeetCode
 * @description: 572.另一棵树的子树
 * @author: Mr.Hu
 * @create: 2023-03-27 21:45
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


    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offerLast(root);
        while (deque.size() != 0) {
            TreeNode cur = deque.pollFirst();
            if (cur.val == subRoot.val) {
                if (dfs(cur, subRoot)) return true;
            }
            if (cur.left != null) deque.offerLast(cur.left);
            if (cur.right != null) deque.offerLast(cur.right);
        }
        return false;
    }

    public boolean dfs(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        else if (node1 == null || node2 == null) return false;
        return (node1.val == node2.val && dfs(node1.left, node2.left) && dfs(node1.right, node2.right));
    }

}
