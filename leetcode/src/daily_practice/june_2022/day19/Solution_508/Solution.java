package daily_practice.june_2022.day19.Solution_508;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 508.出现次数最多的子树元素
 * @date 2022年06月19日 9:27
 */
public class Solution {
    Map<Integer, Integer> map = new HashMap<>();

    public int[] findFrequentTreeSum(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        calculateSum(root, sum);
        int num = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > num) {
                list.clear();
                list.add(entry.getKey());
                num = entry.getValue();
            } else if (entry.getValue() == num) {
                list.add(entry.getKey());
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public int calculateSum(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }

        sum += calculateSum(node.left, sum) + calculateSum(node.right, sum) + node.val;
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        return sum;
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
