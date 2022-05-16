package daily_practice.may_2022.day16.question_interview_04_06;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 面试题 04.06.后继者
 * @date 2022年05月16日 9:03
 */
public class Solution {

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {

        List<TreeNode> list = new ArrayList<>();
        search(root, list);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).val == p.val && i < list.size() - 1) {
                return list.get(i + 1);
            }
        }

        return null;

    }

    private void search(TreeNode node, List<TreeNode> list) {
        if (node == null) {
            return;
        }

        search(node.left, list);
        list.add(node);
        search(node.right, list);

    }


}
