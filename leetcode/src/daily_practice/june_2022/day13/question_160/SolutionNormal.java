package daily_practice.june_2022.day13.question_160;

/**
 * 双指针，假设第一个链表从 head 到相交点距离为 a，第二个链表从 head 到相交点距离为 b
 * 从相交点到末尾距离为 c
 * 设计算法第一个链表遍历完后跳到第二个链表，第二个链表同理，因为 (a+c+b)=(b+c+a)，所以相遇点为相交点，
 * 即使没空，两个指针都遍历完两条链表，都到达了各自链表末尾，假设两个指针下一个都为空，则返回 null
 * @author 胡阳
 * @ClassName SolutionNormal
 * @description: 160.相交链表
 * @date 2022年06月13日 9:27
 */
public class SolutionNormal {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode p1 = headA;
        ListNode p2 = headB;

        while (p1 != p2) {
            if (p1.next == null && p2.next == null) return null;
            if (p1.next == null) p1 = headB;
            else p1 = p1.next;
            if (p2.next == null) p2 = headA;
            else p2 = p2.next;
        }
        return p1;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
