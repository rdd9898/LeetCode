package daily_practice.april_2023.day12.offer_18;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 18. 删除链表的节点
 * @author: Mr.Hu
 * @create: 2023-04-12 22:25
 **/
public class Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteNode(ListNode head, int val) {
        ListNode cur = head;
        ListNode pre = head;
        if (cur.val == val) return head.next;
        while (cur.next != null) {
            cur = cur.next;
            if (cur.val == val) {
                pre.next = cur.next;
                break;
            }
            pre = pre.next;
        }
        return head;
    }

}
