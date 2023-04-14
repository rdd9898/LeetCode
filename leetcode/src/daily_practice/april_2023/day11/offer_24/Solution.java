package daily_practice.april_2023.day11.offer_24;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 24. 反转链表
 * @author: Mr.Hu
 * @create: 2023-04-11 16:54
 **/
public class Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode cur = head.next;
        head.next = null;
        ListNode pre = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

}
