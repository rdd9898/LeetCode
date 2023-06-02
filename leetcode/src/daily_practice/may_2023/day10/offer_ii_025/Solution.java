package daily_practice.may_2023.day10.offer_ii_025;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 025. 链表中的两数相加
 * @author: Mr.Hu
 * @create: 2023-05-10 15:12
 **/
public class Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> deque1 = new ArrayDeque<>();
        Deque<Integer> deque2 = new ArrayDeque<>();
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        while (cur1 != null) {
            deque1.push(cur1.val);
            cur1 = cur1.next;
        }
        while (cur2 != null) {
            deque2.push(cur2.val);
            cur2 = cur2.next;
        }
        int pre = 0;
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();
        while (!deque1.isEmpty() || !deque2.isEmpty()) {
            int val1 = 0;
            int val2 = 0;
            if (!deque1.isEmpty()) val1 = deque1.pop();
            if (!deque2.isEmpty()) val2 = deque2.pop();
            val1 = val1 + val2 + pre;
            pre = val1 / 10;
            val1 = val1 % 10;
            node1.val = val1;
            node2.next = node1;
            node1 = node2;
            node2 = new ListNode();
        }
        if (pre == 1) {
            node1.val = 1;
            return node1;
        } else return node1.next;
    }

}
