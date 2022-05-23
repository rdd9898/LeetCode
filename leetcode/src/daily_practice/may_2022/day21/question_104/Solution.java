package daily_practice.may_2022.day21.question_104;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 广度优先遍历
 * @author 胡阳
 * @ClassName Solution
 * @description: 104.二叉树的最大深度
 * @date 2022年05月22日 9:21
 */
public class Solution {

    public int maxDepth(TreeNode root) {

        int ans = 0;
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            ans++;
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode cur = queue.poll();
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }

        }
        return ans;
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
