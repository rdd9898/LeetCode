package Algorithm.Introduction_to_algorithms.twelfth_chapter;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: twelfth_chapter
 * @date 2022年06月29日 10:51
 */
public class Solution {

    public void inorderTreeWalk(TreeNode x) {
        if (x != null) {
            inorderTreeWalk(x.left);
            System.out.println(x.key);
            inorderTreeWalk(x.right);
        }
    }

    public TreeNode treeSearch(TreeNode x, int k) {
        if (x == null || k == x.key) {
            return x;
        }
        if (k < x.key) {
            return treeSearch(x.left, k);
        } else return treeSearch(x.right, k);
    }

    public TreeNode iterativeTreeSearch(TreeNode x, int k) {
        while (x != null && k != x.key) {
            if (k < x.key) x = x.left;
            else x = x.right;
        }
        return x;
    }

    public TreeNode treeMinimum(TreeNode x) {
        while (x.left != null) {
            x = x.left;
        }
        return x;
    }

    public TreeNode treeMaximum(TreeNode x) {
        while (x.right != null) {
            x = x.right;
        }
        return x;
    }

    public TreeNode treeSuccessor(TreeNode x) {
        if (x.right != null) return treeMinimum(x.right);
        TreeNode y = x.parent;
        while (y != null && x == y.right) {
            x = y;
            y = y.parent;
        }
        return y;
    }

    public class TreeNode {
        int key;
        TreeNode left;
        TreeNode right;
        TreeNode parent;

        public TreeNode() {
        }

        public TreeNode(int key, TreeNode left, TreeNode right, TreeNode parent) {
            this.key = key;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }
    }
}
