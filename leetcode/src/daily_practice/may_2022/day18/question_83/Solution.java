package daily_practice.may_2022.day18.question_83;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 83.删除排序链表中的重复元素
 * @date 2022年05月18日 11:12
 */
public class Solution {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode ans = new ListNode();
        ans.next = head;

        if (head == null) {
            return head;
        }

        while (head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
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
