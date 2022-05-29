package daily_practice.may_2022.day30.question_1022;

/**
 * @program: LeetCode
 * @description: 1022.从根到叶的二进制之和
 * @author: Mr.Hu
 * @create: 2022-05-29 23:19
 **/
public class Solution {

    int ans = 0;

    public int sumRootToLeaf(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        traverse(root, sb);
        return ans;
    }

    private void traverse(TreeNode node, StringBuffer sb) {
        if (node == null) {
            return;
        }
        sb.append(node.val);
        if (node.left == null && node.right == null) {
            ans += Integer.parseInt(sb.toString(), 2);
            sb.deleteCharAt(sb.length() - 1);
            return;
        }
        traverse(node.left, sb);
        traverse(node.right, sb);
        sb.deleteCharAt(sb.length() - 1);

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
}
