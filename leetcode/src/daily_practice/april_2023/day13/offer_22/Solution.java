package daily_practice.april_2023.day13.offer_22;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 22. 链表中倒数第k个节点
 * @author: Mr.Hu
 * @create: 2023-04-13 20:09
 **/
public class Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        for (int i = 0; i < k; i++) {
            if (second == null) return null;
            second = second.next;
        }
        while (second != null) {
            second = second.next;
            first = first.next;
        }
        return first;
    }

}
