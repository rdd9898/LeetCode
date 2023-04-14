package daily_practice.april_2023.day11.offer_35;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetCode
 * @description:
 * @author: Mr.Hu
 * @create: 2023-04-11 21:10
 **/
public class Solution2 {

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    Map<Node, Node> map = new HashMap<>();

    public Node copyRandomList(Node head) {
        if (head == null) return null;
        if (!map.containsKey(head)) {
            Node headNew = new Node(head.val);
            map.put(head, headNew);
            headNew.next = copyRandomList(head.next);
            headNew.random = copyRandomList(head.random);
        }
        return map.get(head);
    }

}
