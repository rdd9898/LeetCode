package daily_practice.april_2023.day12.offer_32_ii;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 32 - II. 从上到下打印二叉树 II
 * @author: Mr.Hu
 * @create: 2023-04-12 15:36
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

    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        List<Integer> temp = new ArrayList<>();
        deque.offerLast(root);
        int size = 1;
        int tempSize = 0;
        while (!deque.isEmpty()) {
            size--;
            TreeNode cur = deque.pollFirst();
            temp.add(cur.val);
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
                ans.add(temp);
                temp = new ArrayList<>();
            }
        }
        return ans;
    }

}
