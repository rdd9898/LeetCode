package daily_practice.june_2022.day15.question_24;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 24.两两交换链表中的节点
 * @date 2022年06月15日 9:47
 */
public class Solution {

    public ListNode swapPairs(ListNode head) {
        ListNode flag = new ListNode();
        ListNode pre = new ListNode();
        pre.next = head;
        flag = pre;
        while (head != null && head.next != null) {
            pre.next = head.next;
            ListNode temp = head.next;
            head.next = temp.next;
            temp.next = head;
            pre = pre.next.next;
            head = head.next;
        }
        return flag.next;
    }

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

}
