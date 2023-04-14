package daily_practice.april_2023.day14.offer_34;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 34. 二叉树中和为某一值的路径
 * @author: Mr.Hu
 * @create: 2023-04-14 16:48
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

    List<List<Integer>> ans;

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        ans = new ArrayList<>();
        if (root == null) return ans;
        List<Integer> temp = new ArrayList<>();
        int sum = 0;
        dfs(root, target, temp, sum);
        return ans;
    }

    private void dfs(TreeNode node, int target, List<Integer> temp, int sum) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            if (sum + node.val == target) {
                temp.add(node.val);
                ans.add(new ArrayList<>(temp));
                temp.remove(temp.size() - 1);
            }
            return;
        }
        temp.add(node.val);
        sum += node.val;
        dfs(node.left, target, temp, sum);
        dfs(node.right, target, temp, sum);
        temp.remove(temp.size() - 1);
    }

}
