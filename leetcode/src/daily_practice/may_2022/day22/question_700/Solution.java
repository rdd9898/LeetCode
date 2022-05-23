package daily_practice.may_2022.day22.question_700;

import daily_practice.may_2022.day22.TreeNode;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 700.二叉搜索树中的搜索
 * @date 2022年05月22日 11:26
 */
public class Solution {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        if (val < root.val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }

}
