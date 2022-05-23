package daily_practice.may_2022.day22;

/**
 * @author 胡阳
 * @ClassName TreeNode
 * @description:
 * @date 2022年05月22日 10:50
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
