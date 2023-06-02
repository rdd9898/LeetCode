package daily_practice.may_2023.day10.offer_ii_026;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 026. 重排链表
 * @author: Mr.Hu
 * @create: 2023-05-10 16:17
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

    public void reorderList(ListNode head) {
        Deque<ListNode> deque = new ArrayDeque<>();
        ListNode cur = head;
        int length = 0;
        while (cur != null) {
            length++;
            deque.push(cur);
            cur = cur.next;
        }
        cur = head;
        for (int i = 0; i < length / 2; i++) {
            ListNode last = deque.pop();
            last.next = cur.next;
            cur.next = last;
            cur = last.next;
        }
        cur.next = null;
    }

}
