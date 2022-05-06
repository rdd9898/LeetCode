package daily_practice.undefined_2022.hy.day43;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description:
 * @date 2022年03月10日 9:49
 */
public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        DiGui(root, res);
        return res;
    }

    private void DiGui(Node root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        for (Node children: root.children) {
            DiGui(children, res);
        }
    }
}
