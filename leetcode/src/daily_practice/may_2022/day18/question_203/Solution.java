package daily_practice.may_2022.day18.question_203;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 203.移除链表元素
 * @date 2022年05月18日 10:39
 */
public class Solution {

    public ListNode removeElements(ListNode head, int val) {
        ListNode node = new ListNode();
        ListNode ans = node;

        while (head != null) {
            if (head.val != val) {
                node.next = head;
                node = node.next;
                head = head.next;
            } else {
                head = head.next;
                node.next = null;
            }
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
