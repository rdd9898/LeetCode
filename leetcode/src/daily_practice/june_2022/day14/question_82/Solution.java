package daily_practice.june_2022.day14.question_82;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 82.删除排序链表中的重复元素Ⅱ
 * @date 2022年06月14日 9:38
 */
public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode flag = new ListNode();
        flag.next = head;
        ListNode pre = flag;
        ListNode post = head;
        while (post.next != null) {
            if (pre.next.val == post.next.val) {
                while (post.next.next != null && post.next.val == post.next.next.val) {
                    post = post.next;
                }
                pre.next = post.next.next;
                if (pre.next == null) break;
                post = pre.next;
            } else {
                pre = pre.next;
                post = post.next;
            }
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
