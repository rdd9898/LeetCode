package daily_practice.undefined_2022.hy.day20;

//1609.奇偶树

//如果一棵二叉树满足下述几个条件，则可以称为 奇偶树 ：
//
//二叉树根节点所在层下标为 0 ，根的子节点所在层下标为 1 ，根的孙节点所在层下标为 2 ，依此类推。
//偶数下标 层上的所有节点的值都是 奇 整数，从左到右按顺序 严格递增
//奇数下标 层上的所有节点的值都是 偶 整数，从左到右按顺序 严格递减
//给你二叉树的根节点，如果二叉树为 奇偶树 ，则返回 true ，否则返回 false 。

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int prev = level % 2 == 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    int value = node.val;
                    // 如果奇数层不是偶数 或 偶数层不是奇数 返回false
                    if (level % 2 == value % 2) {
                        return false;
                    }
                    // 如果奇数层不是严格递减或偶数层不是严格递增 返回false
                    if ((level % 2 == 0 && value <= prev) || (level % 2 == 1 && value >= prev)) {
                        return false;
                    }

                    prev = value;
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
            }
            level++;
        }
        return true;
    }
}
