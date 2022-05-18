package daily_practice.may_2022.day18.question_206;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 206.反转链表
 * @date 2022年05月18日 11:01
 */
public class Solution {

    public ListNode reverseList(ListNode head) {

        ListNode ans = new ListNode();
        ListNode cur = new ListNode();
        cur.next = head;
        cur = cur.next;

        if (head == null || head.next == null) {
            return head;
        }

        while (cur != null) {
            head = cur;
            cur = cur.next;
            head.next = ans.next;
            ans.next = head;
        }

        return ans.next;

    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
