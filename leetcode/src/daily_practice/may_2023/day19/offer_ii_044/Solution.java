package daily_practice.may_2023.day19.offer_ii_044;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 044. 二叉树每层的最大值
 * @author: Mr.Hu
 * @create: 2023-05-19 16:20
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

    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        queue.offer(root);
        int max = Integer.MIN_VALUE;
        int size = 1;
        int tmpSize = 0;
        while (!queue.isEmpty()) {
            size--;
            TreeNode cur = queue.poll();
            max = Integer.max(max, cur.val);
            if (cur.left != null) {
                queue.offer(cur.left);
                tmpSize++;
            }
            if (cur.right != null) {
                queue.offer(cur.right);
                tmpSize++;
            }
            if (size == 0) {
                size = tmpSize;
                tmpSize = 0;
                res.add(max);
                max = Integer.MIN_VALUE;
            }
        }
        return res;
    }

}
