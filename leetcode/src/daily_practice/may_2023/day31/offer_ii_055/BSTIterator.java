package daily_practice.may_2023.day31.offer_ii_055;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 055. 二叉搜索树迭代器
 * @author: Mr.Hu
 * @create: 2023-05-31 21:18
 **/
public class BSTIterator {

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

    TreeNode cur;
    Deque<TreeNode> deque;

    public BSTIterator(TreeNode root) {
        cur = root;
        deque = new LinkedList<>();
    }

    public int next() {
        while (cur != null) {
            deque.push(cur);
            cur = cur.left;
        }
        cur = deque.pop();
        int res = cur.val;
        cur = cur.right;
        return res;
    }

    public boolean hasNext() {
        return cur != null || !deque.isEmpty();
    }
}
