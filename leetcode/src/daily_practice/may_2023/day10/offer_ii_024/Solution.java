package daily_practice.may_2023.day10.offer_ii_024;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 024. 反转链表
 * @author: Mr.Hu
 * @create: 2023-05-10 14:55
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

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode cur = head;
        ListNode last = cur.next;
        cur.next = null;
        while (last != null) {
            ListNode tmp = last.next;
            last.next = cur;
            cur = last;
            last = tmp;
        }
        return cur;
    }

}
