package weekly_race.week_292.question_6057;

import java.util.List;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 6057.统计值等于子树平均值的节点数
 * @date 2022年05月08日 10:50
 */
public class Solution {

    int ans = 0;

    public int averageOfSubtree(TreeNode root) {
        int size = 0;
        dfs(root, size);
        return ans;
    }

    private int[] dfs(TreeNode node, int size) {
        if (node == null) {
            return new int[2];
        }
        int[] ints1 = dfs(node.left, 0);
        int[] ints2 = dfs(node.right, 0);
        int[] res = new int[2];
        res[0] = node.val + ints1[0] + ints2[0];
        res[1] = 1 + ints1[1] + ints2[1];
        if (res[0] / res[1] == node.val) {
            ans++;
        }
        return res;
    }

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;this.left = left;
            this.right = right;
        }

    }
}
