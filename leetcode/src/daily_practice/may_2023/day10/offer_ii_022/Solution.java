package daily_practice.may_2023.day10.offer_ii_022;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 022. 链表中环的入口节点
 * @author: Mr.Hu
 * @create: 2023-05-10 10:38
 **/
public class Solution {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        if (fast.next == null || fast.next.next == null) return null;
        fast = fast.next.next;
        slow = slow.next;
        while (fast != slow) {
            if (fast.next == null || fast.next.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

}
