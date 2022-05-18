package daily_practice.may_2022.day18.question_21;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 21.合并两个有序链表
 * @date 2022年05月18日 10:30
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode();
        ListNode ans = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                head.next = list1;
                head = head.next;
                list1 = list1.next;
            } else {
                head.next = list2;
                head = head.next;
                list2 = list2.next;
            }
        }
        if (list1 != null) {
            head.next = list1;
        } else if (list2 != null) {
            head.next = list2;
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
