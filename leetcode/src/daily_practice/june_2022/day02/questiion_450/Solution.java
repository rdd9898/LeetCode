package daily_practice.june_2022.day02.questiion_450;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 450.删除二叉搜索树中的节点
 * @date 2022年06月02日 9:43
 */
public class Solution {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.val) delete(root, root.left, key, 1);
        else if (key > root.val) delete(root, root.right, key, 2);
        else {
            if (root.right != null) {
                TreeNode tmp = root.right;
                while (tmp.left != null) {
                    tmp = tmp.left;
                }
                tmp.left = root.left;
                return root.right;
            } else {
                return root.left;
            }
        }
        return root;
    }

    private void delete(TreeNode parent, TreeNode node, int key, int flag) {
        if (node == null) {
            return;
        }
        if (key < node.val) {
            delete(node, node.left, key, 1);
        } else if (key > node.val) {
            delete(node, node.right, key, 2);
        } else {
            if (node.right != null) {
                TreeNode tmp = node.right;
                while (tmp.left != null) {
                    tmp = tmp.left;
                }
                tmp.left = node.left;
                if (flag == 1) {
                    parent.left = node.right;
                } else {
                    parent.right = node.right;
                }
            } else {
                if (flag == 1) {
                    parent.left = node.left;
                } else {
                    parent.right = node.left;
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
