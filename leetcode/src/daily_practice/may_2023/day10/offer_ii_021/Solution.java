package daily_practice.may_2023.day10.offer_ii_021;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 021. 删除链表的倒数第 n 个结点
 * @author: Mr.Hu
 * @create: 2023-05-10 10:16
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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode nodePre = head;
        ListNode nodeLast = head;
        int tmp = n;
        while (tmp != 0) {
            nodeLast = nodeLast.next;
            if (nodeLast == null) return head.next;
            tmp--;
        }
        while (nodeLast.next != null) {
            nodeLast = nodeLast.next;
            nodePre = nodePre.next;
        }
        nodePre.next = nodePre.next.next;
        return head;
    }

}
