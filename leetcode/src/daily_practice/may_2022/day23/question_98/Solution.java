package daily_practice.may_2022.day23.question_98;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉搜索树中序遍历为严格递增
 * @author 胡阳
 * @ClassName Solution
 * @description: 98.验证二叉搜索树
 * @date 2022年05月23日 9:33
 */
public class Solution {

    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversal(root, list);
        int tmp = list.get(0);
        boolean flag = true;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= tmp) {
                flag = false;
                break;
            }
            tmp = list.get(i);
        }
        return flag;
    }

    private void inorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, list);
        list.add(node.val);
        inorderTraversal(node.right, list);
    }

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
}
