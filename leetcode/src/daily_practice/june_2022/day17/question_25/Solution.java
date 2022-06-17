package daily_practice.june_2022.day17.question_25;

/**
 * 自己独立完成的一道困难题，虽然这道题简单
 * @author 胡阳
 * @ClassName Solution
 * @description: 25.K 个一组翻转链表
 * @date 2022年06月17日 9:14
 */
public class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode pre = new ListNode();
        ListNode flag = new ListNode();
        pre.next = head;
        flag = pre;
        int n = 0;
        while (head != null) {
            n++;
            if (n == k) {
                ListNode temp1 = pre.next;
                ListNode temp2 = temp1.next;
                pre.next.next = head.next;
                pre.next = head;
                pre = temp1;
                head = head.next;
                for (int i = 1; i < k; i++) {
                    ListNode temp3 = temp2.next;
                    temp2.next = temp1;
                    temp1 = temp2;
                    temp2 = temp3;
                }
                n = 0;
                continue;
            }
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
