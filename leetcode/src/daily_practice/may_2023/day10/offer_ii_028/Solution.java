package daily_practice.may_2023.day10.offer_ii_028;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 028. 展平多级双向链表
 * @author: Mr.Hu
 * @create: 2023-05-10 20:07
 **/
public class Solution {

    static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node flatten(Node head) {
        Node cur = head;
        while (cur != null) {
            if (cur.child != null) {
                Node last = flat(cur.child);
                if (cur.next != null) cur.next.prev = last;
                last.next = cur.next;
                cur.next = cur.child;
                cur.child.prev = cur;
                cur.child = null;
                cur = last;
            }
            cur = cur.next;
        }
        return head;
    }

    private Node flat(Node node) {
        Node cur = node;
        while (cur != null) {
            if (cur.child != null) {
                Node last = flat(cur.child);
                if (cur.next != null) cur.next.prev = last;
                last.next = cur.next;
                cur.next = cur.child;
                cur.child.prev = cur;
                cur.child = null;
                cur = last;
            }
            if (cur.next != null) cur = cur.next;
            else break;
        }
        return cur;
    }

}
