package daily_practice.april_2023.day17.offer_36;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 36. 二叉搜索树与双向链表
 * @author: Mr.Hu
 * @create: 2023-04-17 15:26
 **/
public class Solution {

    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

    Node pre, head;

    public Node treeToDoublyList(Node root) {
        if (root == null) return root;
        search(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    private void search(Node node) {
        if (node == null) return;
        search(node.left);
        if (pre != null) pre.right = node;
        else head = node;
        node.left = pre;
        pre = node;
        search(node.right);
    }

}
