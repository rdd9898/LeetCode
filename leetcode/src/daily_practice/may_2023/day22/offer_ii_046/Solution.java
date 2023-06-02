package daily_practice.may_2023.day22.offer_ii_046;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 046. 二叉树的右侧视图
 * @author: Mr.Hu
 * @create: 2023-05-22 21:11
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

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int size = 1;
        int tmpSize = 0;
        while (!queue.isEmpty()) {
            size--;
            TreeNode cur = queue.poll();
            if (size == 0) res.add(cur.val);
            if (cur.left != null) {
                tmpSize++;
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                tmpSize++;
                queue.offer(cur.right);
            }
            if (size == 0) {
                size = tmpSize;
                tmpSize = 0;
            }
        }
        return res;
    }
}
