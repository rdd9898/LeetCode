package daily_practice.may_2023.day10.offer_ii_023;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 023. 两个链表的第一个重合节点
 * @author: Mr.Hu
 * @create: 2023-05-10 11:12
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

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 遍历两遍，计算长度，
        ListNode a = headA;
        ListNode b = headB;
        int lengthA = 0;
        int lengthB = 0;
        while (a != null) {
            a = a.next;
            lengthA++;
        }
        while (b != null) {
            b = b.next;
            lengthB++;
        }
        if (lengthA < lengthB) {
            a = headB;
            b = headA;
            while (lengthB != lengthA) {
                a = a.next;
                lengthB--;
            }
        } else {
            a = headA;
            b = headB;
            while (lengthB != lengthA) {
                a = a.next;
                lengthA--;
            }
        }
        while (a != null) {
            if (a == b) return a;
            a = a.next;
            b = b.next;
        }
        return null;
    }

}
