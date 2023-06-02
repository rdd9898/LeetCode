package daily_practice.april_2023.day20.offer_33;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 33. 二叉搜索树的后序遍历序列
 * @author: Mr.Hu
 * @create: 2023-04-20 16:13
 **/
public class Solution {

    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }

    private boolean recur(int[] postorder, int i, int j) {
        if (i >= j) return true;
        int p = i;
        while (postorder[p] < postorder[j]) p++;
        int m = p;
        while (postorder[p] > postorder[j]) p++;
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }

}
