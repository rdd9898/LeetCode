package hy.day50;

import java.util.ArrayList;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description:
 * @date 2022年03月21日 9:25
 */
public class Solution {
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == k) {
                    return true;
                }
            }
        }
        return false;
    }

    public void inOrder(TreeNode node, ArrayList<Integer> list) {
        if (node == null) {
            return;
        }
        inOrder(node.left, list);
        list.add(node.val);
        inOrder(node.right, list);

    }

}
