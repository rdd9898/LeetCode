package daily_practice.may_2023.day23.offer_ii_050;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 050. 向下的路径节点之和
 * @author: Mr.Hu
 * @create: 2023-05-23 21:44
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

    int res = 0;
    Map<Long, Integer> map = new HashMap<>();

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        map.put(0L, 1);
        dfs(root, 0, targetSum);
        if (targetSum == 0) res--;
        return res;
    }

    private void dfs(TreeNode node, long sum, int targetSum) {
        if (node == null) return;
        sum += node.val;
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        res += map.getOrDefault(sum - targetSum, 0);
        dfs(node.left, sum, targetSum);
        dfs(node.right, sum, targetSum);
        map.put(sum, map.get(sum) - 1);
    }
}
