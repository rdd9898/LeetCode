package hy4.day12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 1305.两棵二叉树搜索树中的所有元素
 * @date 2022年05月01日 9:56
 */
public class Solution {

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> answers = new ArrayList<>();
        add(root1, answers);
        add(root2, answers);
        answers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        return answers;
    }

    private void add(TreeNode root, List<Integer> answers) {
        if (root == null) {
            return;
        }
        answers.add(root.val);
        add(root.left, answers);
        add(root.right, answers);
    }

}


