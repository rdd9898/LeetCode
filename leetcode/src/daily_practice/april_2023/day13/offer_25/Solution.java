package daily_practice.april_2023.day13.offer_25;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 25. 合并两个排序的链表
 * @author: Mr.Hu
 * @create: 2023-04-13 20:19
 **/
public class Solution {

    static public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode head = l1.val < l2.val ? l1 : l2;
        ListNode cur1 = l1.val < l2.val ? l1 : l2;
        ListNode cur2 = l1.val < l2.val ? l2 : l1;
        while (cur2 != null) {
            if (cur1.next == null) {
                cur1.next = cur2;
                break;
            } else {
                if (cur1.next.val > cur2.val) {
                    ListNode temp = cur1.next;
                    cur1.next = cur2;
                    cur1 = cur2;
                    cur2 = cur2.next;
                    cur1.next = temp;
                } else cur1 = cur1.next;
            }
        }
        return head;
    }

}
