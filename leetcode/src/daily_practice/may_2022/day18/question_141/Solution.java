package daily_practice.may_2022.day18.question_141;

/**
 * 快慢指针
 * @author 胡阳
 * @ClassName Solution
 * @description: 141.环形链表
 * @date 2022年05月18日 9:58
 */
public class Solution {

    public boolean hasCycle(ListNode head) {
        ListNode curLow = head;
        ListNode curFast = head;
        if(curLow == null) {
            return false;
        }
        do {
            curFast = curFast.next;
            if (curFast == null) {
                return false;
            }
            curFast = curFast.next;
            curLow = curLow.next;
            if (curFast == curLow) {
                return true;
            }
        } while (curFast != null);

        return false;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
