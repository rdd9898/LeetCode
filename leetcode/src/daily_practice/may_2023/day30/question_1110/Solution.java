package daily_practice.may_2023.day30.question_1110;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 1110. 删点成林
 * @author: Mr.Hu
 * @create: 2023-05-30 19:47
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

    List<TreeNode> res;

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        res = new ArrayList<>();
        dfs(root, to_delete);
        boolean flag = true;
        for (int j : to_delete) {
            if (root.val == j) {
                flag = false;
                if (root.left != null) {
                    res.add(root.left);
                }
                if (root.right != null) {
                    res.add(root.right);
                }
                break;
            }
        }
        if (flag) res.add(root);
        return res;
    }

    private void dfs(TreeNode node, int[] to_delete) {
        if (node == null) return;
        dfs(node.left, to_delete);
        dfs(node.right, to_delete);
        if (node.left != null) {
            for (int i : to_delete) {
                if (i == node.left.val) {
                    if (node.left.left != null) {
                        res.add(node.left.left);
                    }
                    if (node.left.right != null) {
                        res.add(node.left.right);
                    }
                    node.left = null;
                    break;
                }
            }
        }
        if (node.right != null) {
            for (int i : to_delete) {
                if (i == node.right.val) {
                    if (node.right.left != null) {
                        res.add(node.right.left);
                    }
                    if (node.right.right != null) {
                        res.add(node.right.right);
                    }
                    node.right = null;
                    break;
                }
            }
        }
    }
}
