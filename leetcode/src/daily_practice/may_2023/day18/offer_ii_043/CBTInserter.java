package daily_practice.may_2023.day18.offer_ii_043;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 043. 往完全二叉树添加节点
 * @author: Mr.Hu
 * @create: 2023-05-18 21:47
 **/
public class CBTInserter {

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

    Queue<TreeNode> queue;
    TreeNode root;

    public CBTInserter(TreeNode root) {
        this.root = root;
        queue = new ArrayDeque<>();
        queue.offer(root);
        TreeNode cur = root;
        while (true) {
            if (cur.left != null) queue.offer(cur.left);
            if (cur.right != null) queue.offer(cur.right);
            if (cur.left != null && cur.right != null) {
                queue.poll();
                cur = queue.peek();
            } else break;
        }
    }

    public int insert(int v) {
        TreeNode cur = new TreeNode(v);
        queue.offer(cur);
        TreeNode node = queue.peek();
        if (node.left == null) node.left = cur;
        else if (node.right == null) {
            node.right = cur;
            queue.poll();
        }
        return node.val;
    }

    public TreeNode get_root() {
        return root;
    }
}
