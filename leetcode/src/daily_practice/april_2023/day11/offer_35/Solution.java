package daily_practice.april_2023.day11.offer_35;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 35. 复杂链表的复制
 * @author: Mr.Hu
 * @create: 2023-04-11 17:13
 **/
public class Solution {

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) return head;
        Node ansHead = new Node(head.val);
        Node ansCur = ansHead;
        List<Node> list = new ArrayList<>();
        list.add(head);
        Node cur = head.next;

        while (cur != null) {
            ansCur.next = new Node(cur.val);
            ansCur = ansCur.next;
            list.add(cur);
            cur = cur.next;
        }
        ansCur = ansHead;
        for (Node node : list) {
            Node node1 = ansCur;
            Node node2 = list.get(0);
            Node temp1 = ansHead;
            Node temp2 = node.random;
            while (temp2 != node2) {
                temp1 = temp1.next;
                node2 = node2.next;
            }
            node1.random = temp1;
            ansCur = ansCur.next;
        }

        return ansHead;
    }

}
