package Algorithm.PriorityQueue;

/**
 * 通过链来实现
 * @author 胡阳
 * @ClassName PriorityQueue
 * @description: 优先队列
 * @date 2022年05月02日 10:53
 */
public class PriorityQueue {

    static class Node {
        int value;
        int priority;
        Node next;

        public Node(int value, int priority) {
            this.value = value;
            this.priority = priority;
        }
    }

    Node head = null;

    // 加入新节点
    public void push(int value, int priority) {

        if (head == null) {
            head = new Node(value, priority);
            return;
        }

        Node cur = head;
        Node newNode = new Node(value, priority);

        if (head.priority < priority) {
            // 新节点优先级比 head 高，成为新的 head
            newNode.next = head;
            this.head = newNode;
        } else {
            // 如果新节点优先级没有 head 高
            // 通过 while 循环，寻找接下来节点中优先级小于 newNode 的节点
            while (cur.next != null && cur.next.priority > priority) {
                // cur 可能是最后一个节点，也可能是优先级大于 newNode 的，但后面第一个节点优先级小于 newNode 的节点
                cur = cur.next;
            }
            // 插入 newNode 节点到 cur 后面
            newNode.next = cur.next;
            cur.next = newNode;
        }

    }

    // 获得第一个节点不删除
    public Node peek() {
        return head;
    }

    // 获得第一个节点并删除
    public Node pop() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        head = head.next;
        return temp;
    }

    // 判断是否为空
    public boolean isEmpty() {
        return head == null;
    }

}
