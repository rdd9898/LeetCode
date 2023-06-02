package daily_practice.june_2023.day01.offer_ii_056;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 056. 二叉搜索树中两个节点之和
 * @author: Mr.Hu
 * @create: 2023-06-01 20:45
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

    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        Deque<TreeNode> deque = new LinkedList<>();
        TreeNode cur = root;
        while (!deque.isEmpty() || cur != null) {
            while (cur != null) {
                deque.push(cur);
                cur = cur.left;
            }
            cur = deque.pop();
            if (set.contains(k - cur.val)) {
                return true;
            }
            set.add(cur.val);
            cur = cur.right;
        }
        return false;
    }
}
