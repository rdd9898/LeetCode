package daily_practice.may_2023.day22.offer_ii_048;

import java.util.*;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 048. 序列化与反序列化二叉树
 * @author: Mr.Hu
 * @create: 2023-05-22 21:42
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
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        List<TreeNode> list = new LinkedList<>();
        list.add(root);
        int index = 0;
        while (index != list.size()) {
            if (list.get(index) != null) {
                TreeNode cur = list.get(index);
                sb.append(cur.val).append(" ");
                if (cur.left == null) list.add(null);
                else list.add(cur.left);
                if (cur.right == null) list.add(null);
                else list.add(cur.right);
            } else sb.append("null").append(" ");
            index++;
        }
        sb.delete(sb.length() - 1, sb.length());
        sb.append("]");
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        TreeNode root;
        String[] strings = data.substring(1, data.length() - 1).split(" ");
        if (strings[0].equals("null")) return null;
        else root = new TreeNode(Integer.parseInt(strings[0]));
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int index = 1;
        while (index < strings.length) {
            TreeNode cur = queue.poll();
            if (!strings[index].equals("null")) {
                TreeNode node = new TreeNode(Integer.parseInt(strings[index]));
                cur.left = node;
                queue.offer(node);
            }
            index++;
            if (!strings[index].equals("null")) {
                TreeNode node = new TreeNode(Integer.parseInt(strings[index]));
                cur.right = node;
                queue.offer(node);
            }
            index++;
        }
        return root;
    }

    public static void main(String[] args) {
        Codec codec = new Codec();
        Codec.TreeNode node1 = new TreeNode(1);
        Codec.TreeNode node2 = new TreeNode(2);
        Codec.TreeNode node3 = new TreeNode(3);
        Codec.TreeNode node4 = new TreeNode(4);
        Codec.TreeNode node5 = new TreeNode(5);
        node1.left = node2;
        node1.right =node3;
        node3.left = node4;
        node3.right = node5;
        Codec ser = new Codec();
        Codec deser = new Codec();
        TreeNode ans = deser.deserialize(ser.serialize(node1));
    }
}
