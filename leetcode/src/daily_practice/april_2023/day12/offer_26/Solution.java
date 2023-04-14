package daily_practice.april_2023.day12.offer_26;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 26. 树的子结构
 * @author: Mr.Hu
 * @create: 2023-04-12 16:12
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

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) return false;
        return dfs(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean dfs(TreeNode node1, TreeNode node2) {
        if (node2 == null) return true;
        if (node1 == null || node1.val != node2.val) return false;
        return (dfs(node1.left, node2.left) && dfs(node1.right, node2.right));
    }

}
