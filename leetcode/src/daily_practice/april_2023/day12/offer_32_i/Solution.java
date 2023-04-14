package daily_practice.april_2023.day12.offer_32_i;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 32 - I. 从上到下打印二叉树
 * @author: Mr.Hu
 * @create: 2023-04-12 14:49
 **/
public class Solution {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];
        Deque<TreeNode> deque = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        deque.offerLast(root);
        while (!deque.isEmpty()) {
            TreeNode cur = deque.pollFirst();
            list.add(cur.val);
            if (cur.left != null) deque.offerLast(cur.left);
            if (cur.right != null) deque.offerLast(cur.right);
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

}
