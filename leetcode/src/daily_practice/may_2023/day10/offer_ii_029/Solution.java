package daily_practice.may_2023.day10.offer_ii_029;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 029. 排序的循环链表
 * @author: Mr.Hu
 * @create: 2023-05-10 20:43
 **/
public class Solution {

    class Node {
        public int val;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _next) {
            val = _val;
            next = _next;
        }
    }

    public Node insert(Node head, int insertVal) {
        Node tmp = new Node(insertVal);
        if (head == null) {
            tmp.next = tmp;
            return tmp;
        }
        Node cur = head;
        boolean flag = true;
        while (true) {
            if (cur == head) flag = !flag;
            if (cur.val <= insertVal && cur.next.val >= insertVal) {
                tmp.next = cur.next;
                cur.next = tmp;
                break;
            } else if ((cur.val <= insertVal || cur.next.val >= insertVal) && cur.next.val < cur.val) {
                tmp.next = cur.next;
                cur.next = tmp;
                break;
            }
            if (flag) {
                tmp.next = cur.next;
                cur.next = tmp;
                break;
            }
            cur = cur.next;
        }
        return head;
    }

}
