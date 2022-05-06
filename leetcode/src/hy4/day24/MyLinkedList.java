package hy4.day24;

/**
 * 单向链表
 * @author 胡阳
 * @ClassName MyLinkedList
 * @description: 707.设计链表
 * @date 2022年05月06日 9:34
 */
public class MyLinkedList {

    int size;
    Node head;

    public MyLinkedList() {
        head = new Node(0);
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        Node cur = head;
        for (int i = 0; i < index + 1; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        Node add = new Node(val);
        add.next = head.next;
        head.next = add;
        size++;
    }

    public void addAtTail(int val) {
        Node cur = head;
        for (int i = 0; i < size; i++) {
            cur = cur.next;
        }
        size++;
        Node add = new Node(val);
        cur.next = add;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            addAtHead(val);
            return;
        }
        Node cur = head;
        Node add = new Node(val);
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        add.next = cur.next;
        cur.next = add;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        size--;
    }

    public class Node {

        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

    }
}
