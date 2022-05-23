package daily_practice.may_2022.day23.question_653;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 653.两数之和 Ⅳ - 输入 BST
 * @date 2022年05月23日 9:47
 */
public class Solution {

    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorderTraversal(root, list);
        for (int i = 0; i < list.size() - 1; i++) {
            int left = i + 1;
            int right = list.size() - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (list.get(i) + list.get(mid) > k) {
                    right = mid - 1;
                } else if (list.get(i) + list.get(mid) < k) {
                    left = mid + 1;
                } else {
                    return true;
                }
            }
        }
        return false;
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
