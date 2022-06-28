package daily_practice.june_2022.day28.question_173;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 胡阳
 * @ClassName BSTIterator
 * @description: 173.二叉搜索树迭代器
 * @date 2022年06月28日 9:12
 */
public class BSTIterator {

    List<Integer> list;
    int curNode = 0;

    public BSTIterator(TreeNode root) {
        list = new ArrayList<Integer>();
        dfs(root);
    }

    public void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.left);
        list.add(node.val);
        dfs(node.right);
    }

    public int next() {
        int ans = list.get(curNode);
        curNode++;
        return ans;
    }

    public boolean hasNext() {
        return list.size() >= curNode + 1;
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
