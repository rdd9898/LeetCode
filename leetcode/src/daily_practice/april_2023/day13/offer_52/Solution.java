package daily_practice.april_2023.day13.offer_52;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 52. 两个链表的第一个公共节点
 * @author: Mr.Hu
 * @create: 2023-04-13 21:07
 **/
public class Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int k = 0;
        boolean flag = true;
        ListNode cur1 = headA;
        ListNode cur2 = headB;
        while (cur1 != null && cur2 != null) {
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        if (cur2 != null) {
            while (cur2 != null) {
                flag = true;
                k++;
                cur2 = cur2.next;
            }
        } else if (cur1 != null) {
            while (cur1 != null) {
                flag = false;
                k++;
                cur1 = cur1.next;
            }
        }
        if (flag) {
            cur1 = headB;
            cur2 = headA;
        } else {
            cur1 = headA;
            cur2 = headB;
        }
        for (int i = 0; i < k; i++) {
            cur1 = cur1.next;
        }
        while (cur1 != null) {
            if (cur1 == cur2) return cur1;
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return null;
    }

}
