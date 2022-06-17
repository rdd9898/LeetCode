package daily_practice.june_2022.day16.question_707;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 707.设计链表
 * @date 2022年06月16日 9:50
 */
public class MyLinkedList {

    int n;
    ListNode head;

    public MyLinkedList() {
        head = new ListNode();
        n = 0;
    }

    public int get(int index) {
        if (n <= index) return -1;
        ListNode cur = head;
        for (int i = 0; i < index + 1; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head.next;
        head.next = newNode;
        n++;
    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        ListNode cur = head;
        for (int i = 0; i < n; i++) {
            cur = cur.next;
        }
        cur.next = newNode;
        n++;
    }

    public void addAtIndex(int index, int val) {
        if (n < index) return;
        if (index < 0) {
            addAtHead(val);
            return;
        }
        ListNode newNode = new ListNode(val);
        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        newNode.next = cur.next;
        cur.next = newNode;
        n++;
    }

    public void deleteAtIndex(int index) {
        if (n <= index || index < 0) return;
        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        n--;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int x) { val = x; }
    }

}
