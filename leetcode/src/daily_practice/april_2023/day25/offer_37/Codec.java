package daily_practice.april_2023.day25.offer_37;

import java.util.*;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 37. 序列化二叉树
 * @author: Mr.Hu
 * @create: 2023-04-25 21:17
 **/
public class Codec {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "[]";
        StringBuilder res = new StringBuilder("[");
        Queue<TreeNode> queue = new LinkedList<TreeNode>() {{ add(root); }};
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(node != null) {
                res.append(node.val + ",");
                queue.add(node.left);
                queue.add(node.right);
            }
            else res.append("null,");
        }
        res.deleteCharAt(res.length() - 1);
        res.append("]");
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("[]")) return null;
        String[] vals = data.substring(1, data.length() - 1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (!vals[i].equals("null")) {
                cur.left = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(cur.left);
            }
            i++;
            if (!vals[i].equals("null")) {
                cur.right = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(cur.right);
            }
            i++;
        }
        return root;
    }

}
