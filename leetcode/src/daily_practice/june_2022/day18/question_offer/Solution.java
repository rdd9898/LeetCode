package daily_practice.june_2022.day18.question_offer;

/**
 * @program: LeetCode
 * @description: OfferⅡ 029.排序的循环链表
 * @author: Mr.Hu
 * @create: 2022-06-18 13:11
 **/
public class Solution {

    public Node insert(Node head, int insertVal) {
        Node ans = head;
        if (head == null) {
            head = new Node();
            head.val = insertVal;
            head.next = head;
            return head;
        }
        if (head.next == head) {
            Node tmp = new Node(insertVal);
            head.next = tmp;
            tmp.next = head;
            if (head.val <= insertVal) {
                return head;
            } else {
                return head;
            }
        }
        Node insertNode = new Node(insertVal);
        if (head.val >= insertVal) {
            insertNode.next = head;
            Node tmp = head;
            while (tmp.next != head) {
                if (tmp.val > tmp.next.val && insertVal <= tmp.next.val) {
                    insertNode.next = tmp.next;
                    tmp.next = insertNode;
                    return head;
                } else if (tmp.val <= tmp.next.val && tmp.val <= insertVal && insertVal <= tmp.next.val) {
                    insertNode.next = tmp.next;
                    tmp.next = insertNode;
                    return head;
                }
                tmp = tmp.next;
            }
            tmp.next = insertNode;
            return head;
        }
        while (true) {
            if (head.val <= insertVal && head.next.val >= insertVal) {
                insertNode.next = head.next;
                head.next = insertNode;
                break;
            } else if (head.val <= insertVal && head.next.val <= insertVal && head.val > head.next.val){
                insertNode.next = head.next;
                head.next = insertNode;
                break;
            }
            head = head.next;
        }
        return ans;
    }

    class Node {
        public int val;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _next) {
            val = _val;
            next = _next;
        }
    };

}
