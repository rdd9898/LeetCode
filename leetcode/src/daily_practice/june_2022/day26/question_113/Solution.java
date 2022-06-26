package daily_practice.june_2022.day26.question_113;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 113.路径总和Ⅱ
 * @date 2022年06月26日 10:18
 */
public class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        int curSum = 0;
        List<Integer> list = new ArrayList<>();
        dfs(root, targetSum, curSum, list);
        for (int i = 0; i < list.size(); i=i+2) {
            list.remove(i);
        }
        return ans;
    }

    public void dfs(TreeNode node, int targetSum, int curSum, List<Integer> list) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        curSum += node.val;
        List<Integer> list2 = new ArrayList<>();
        for (int num : list) {
            list2.add(num);
        }
        if (node.left == null && node.right == null && curSum == targetSum) {
            ans.add(list);
        }
        dfs(node.left, targetSum, curSum, list);
        dfs(node.right, targetSum, curSum, list2);
    }

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

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node.left = node2;
        node.right = node3;
        Solution solution = new Solution();
        solution.pathSum(node, 3);
    }
}
