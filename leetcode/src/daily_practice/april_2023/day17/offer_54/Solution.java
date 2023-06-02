package daily_practice.april_2023.day17.offer_54;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 54. 二叉搜索树的第k大节点
 * @author: Mr.Hu
 * @create: 2023-04-17 20:27
 **/
public class Solution {

    static public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int num = 0;
    int ans;
    boolean flag = false;

    public int kthLargest(TreeNode root, int k) {
        search(root, k);
        return ans;
    }

    private void search(TreeNode node, int k) {
        if (node == null) return;
        if (flag) return;
        search(node.right, k);
        if (flag) return;
        num++;
        if (num == k) {
            ans = node.val;
            flag = true;
            return;
        }
        search(node.left, k);
    }

}
