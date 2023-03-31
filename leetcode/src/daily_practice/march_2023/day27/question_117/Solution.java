package daily_practice.march_2023.day27.question_117;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: LeetCode
 * @description: 117.填充每个节点的下一个右侧节点指针 II
 * @author: Mr.Hu
 * @create: 2023-03-27 21:37
 **/
public class Solution {

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {
        if (root == null) return root;
        Deque<Node> deque = new ArrayDeque<>();
        deque.offerLast(root);
        int size = 1;
        int tempSize = 0;
        while (deque.size() > 0) {
            Node cur = deque.pollFirst();
            size--;
            if (size != 0) cur.next = deque.getFirst();
            else cur.next = null;
            if (cur.left != null) {
                deque.offerLast(cur.left);
                tempSize++;
            }
            if (cur.right != null) {
                deque.offerLast(cur.right);
                tempSize++;
            }
            if (size == 0) {
                size = tempSize;
                tempSize = 0;
            }
        }
        return root;
    }

}
