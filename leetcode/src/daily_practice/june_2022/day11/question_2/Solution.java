package daily_practice.june_2022.day11.question_2;

/**
 * @program: LeetCode
 * @description: 2.两数相加
 * @author: Mr.Hu
 * @create: 2022-06-11 12:23
 **/
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode cur = new ListNode();
        head.next = cur;
        ListNode pre = head;
        boolean flag = false;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                int temp = l1.val + l2.val;
                if (flag) temp++;
                if (temp >= 10) flag = true;
                else flag = false;
                cur.val = temp % 10;
                ListNode temp2 = new ListNode();
                cur.next = temp2;
                pre = cur;
                cur = temp2;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                int temp = l1.val;
                if (flag) temp++;
                if (temp >= 10) flag = true;
                else flag = false;
                cur.val = temp % 10;
                ListNode temp2 = new ListNode();
                cur.next = temp2;
                pre = cur;
                cur = temp2;
                l1 = l1.next;
            } else if (l2 != null) {
                int temp = l2.val;
                if (flag) temp++;
                if (temp >= 10) flag = true;
                else flag = false;
                cur.val = temp % 10;
                ListNode temp2 = new ListNode();
                cur.next = temp2;
                pre = cur;
                cur = temp2;
                l2 = l2.next;
            }
        }
        if (flag) {
            cur.val = 1;
        } else {
            pre.next = null;
        }
        return head.next;
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
