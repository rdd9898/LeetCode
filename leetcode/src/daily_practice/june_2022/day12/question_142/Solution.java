package daily_practice.june_2022.day12.question_142;

/**
 * 解题思路：分两个步骤，首先通过快慢指针的方法判断链表是否有环；
 * 接下来如果有环，则寻找入环的第一个节点。
 * 具体的方法为，首先假定链表起点到入环的第一个节点 A 的长度为 a【未知】，
 * 到快慢指针相遇的节点 B 的长度为（a + b）【这个长度是已知的】。
 * 现在我们想知道 a 的值，注意到快指针 p2 始终是慢指针 p 走过长度的 2 倍，
 * 所以慢指针 p 从 B 继续走（a + b）又能回到 B 点，
 * 如果只走 a 个长度就能回到节点 A。
 * 但是 a 的值是不知道的。
 * 相遇结点到入环结点的距离为 c，a+b+c+b = 2(a+b) ，可以得出 a = c
 * 解决思路是曲线救国，注意到起点到 A 的长度是a，
 * 那么可以用一个从起点开始的新指针 q 和从节点 B 开始的慢指针 p 同步走，
 * 相遇的地方必然是入环的第一个节点 A。
 * @description: 142.环形链表Ⅱ
 * @author: Mr.Hu
 * @create: 2022-06-12 12:39
 **/
public class Solution {

    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;

        // 判断是否有环
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = true;
                break;
            }
        }

        // 若有环，找开始的节点。
        if (!flag) return null;
        else {
            ListNode index = head;
            while (index != slow) {
                index = index.next;
                slow = slow.next;
            }
            return slow;
        }
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
