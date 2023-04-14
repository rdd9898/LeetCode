package daily_practice.april_2023.day12.offer_32_iii;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 32 - III. 从上到下打印二叉树 III
 * @author: Mr.Hu
 * @create: 2023-04-12 15:47
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
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        List<Integer> temp = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offerLast(root);
        boolean flag = true;
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
                if (flag) {
                    ans.add(temp);
                } else {
                    reverse(temp, temp.size());
                    ans.add(temp);
                }
                flag = !flag;
                temp = new ArrayList<>();
            }
        }
        return ans;
    }

    private void reverse(List<Integer> list, int size) {
        for (int i = 0; i < size / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(size - i - 1));
            list.set(size - i - 1, temp);
        }
    }

}
