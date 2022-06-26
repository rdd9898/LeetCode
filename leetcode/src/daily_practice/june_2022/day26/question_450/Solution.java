package daily_practice.june_2022.day26.question_450;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 450.删除二叉搜索树中的节点
 * @date 2022年06月26日 10:55
 */
public class Solution {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return root;
        if (key < root.val) {
            dfs(root.left, root, key, false);
        } else if (key > root.val) {
            dfs(root.right, root, key, true);
        } else {
            if (root.right != null) {
                TreeNode node = root.right;
                while (node.left != null) {
                    node = node.left;
                }
                node.left = root.left;
                return root.right;
            } else {
                return root.left;
            }
        }
        return root;
    }

    public void dfs(TreeNode node, TreeNode parent, int key, boolean flag) {
        if (node == null) {
            return;
        }
        if (key < node.val) {
            dfs(node.left, node, key, false);
        } else if (key > node.val) {
            dfs(node.right, node, key, true);
        } else {
            if (node.right != null) {
                TreeNode tmp = node.right;
                while (tmp.left != null) {
                    tmp = tmp.left;
                }
                tmp.left = node.left;
                if (flag) {
                    parent.right = node.right;
                } else {
                    parent.left = node.right;
                }
            } else {
                if (flag) {
                    parent.right = node.left;
                } else {
                    parent.left = node.left;
                }
            }
        }
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
