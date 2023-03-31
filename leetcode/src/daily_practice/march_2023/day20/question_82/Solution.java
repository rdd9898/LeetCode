package daily_practice.march_2023.day20.question_82;

/**
 * @program: LeetCode
 * @description: 82.删除排序链表中的重复元素 II
 * @author: Mr.Hu
 * @create: 2023-03-20 21:48
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

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode headPoint = new ListNode(0, head);
        ListNode cur = headPoint;
        while (cur.next != null && cur.next.next != null) {
            boolean flag = false;
            while (cur.next.next != null && cur.next.val == cur.next.next.val) {
                flag = true;
                cur.next = cur.next.next;
            }
            if (flag) cur.next = cur.next.next;
            else cur = cur.next;
        }
        return headPoint.next;
    }

}
