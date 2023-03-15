package daily_practice.march_2023.day15.question_515;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 515.在每个树行中找最大值
 * @author: Mr.Hu
 * @create: 2023-03-15 21:10
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

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        int max = Integer.MIN_VALUE;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offerFirst(root);
        int size = 1;
        int tempSize = 0;
        while (deque.size() != 0) {
            size--;
            TreeNode cur = deque.pollFirst();
            max = Integer.max(max, cur.val);
            if (size == 0) {
                ans.add(max);
            }
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
                max = Integer.MIN_VALUE;
            }
        }
        return ans;
    }

}
