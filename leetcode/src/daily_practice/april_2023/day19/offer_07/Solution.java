package daily_practice.april_2023.day19.offer_07;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 07. 重建二叉树
 * @author: Mr.Hu
 * @create: 2023-04-19 21:00
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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;
        TreeNode root = new TreeNode(preorder[0]);
        int mid = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]) {
                mid = i;
                break;
            }
        }
        fz(root, 0, mid - 1, 1, mid, preorder, inorder, true);
        fz(root, mid + 1, preorder.length - 1, mid + 1, preorder.length - 1, preorder, inorder, false);
        return root;
    }

    private void fz(TreeNode node, int inL, int inR, int preL, int preR, int[] preorder, int[] inorder, boolean flag) {
        if (preL > preR) return;
        int preMid = preL;
        TreeNode cur = new TreeNode(preorder[preMid]);
        if (flag) {
            node.left = cur;
        } else {
            node.right = cur;
        }
        int inMid = inL;
        for (int i = inL; i <= inR; i++) {
            if (inorder[i] == preorder[preMid]) {
                inMid = i;
                break;
            }
        }
        fz(cur, inL, inMid - 1, preMid + 1, preMid + inMid - inL, preorder, inorder, true);
        fz(cur, inMid + 1, inR, preMid + inMid - inL + 1, preR, preorder, inorder, false);
    }

}
